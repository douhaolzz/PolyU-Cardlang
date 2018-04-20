package Game2018;

import java.util.Vector;

class Blackjack extends GameEngine {
    boolean[] flags;
    int[] points;

    public Blackjack(int num_players) {
        super(num_players);
    } 

    public void initCards(int num_players) {
        // pre-defined
        numPlayers = num_players;
        deck = new Deck();
        hands = new Hand[numPlayers];
        flags = new boolean[numPlayers];
        points = new int[numPlayers];
        for (int z = 0; z < numPlayers; ++z) {
            hands[z] = new Hand(z, getPlayerChar(z));
        }
        prevPlay = new Hand(-1, ' ');
        int _game = 0;

        // game-specific
        deck.shuffle();
        for (int i = 1; i <= numPlayers; ++i) {
            Card c = deck.drawCard();
            hands[i - 1].addCard(c);

            int rank = hands[i - 1].cards.get(1 - 1).getRank();
            if (rank > 10) {
                points[i - 1] = 10;
            } else {
                points[i - 1] = rank;
            }
        }
        flags[1 - 1] = true;
        _game = 21;

        // pre-defined
        displaySize = _game;
        curPlayerID = 0;
        winnerID = -1;
    }

    public String getStatus() {
        // pre-defined
        String s="[Game cards]\n"+"Deck: "+deck.cardCount()+", Dump: "+deck.dumpCount()+"\n\n";
		
		s=s+"[Players' cards]\n";
		for (int z=0;z<numPlayers;z++) {
			char ch=getPlayerChar(z);
			s=s+ch+":"+hands[z].cards.size()+" ";
		}
        s=s+"\n\n";
        
        s=s+"[Players' points]\n";
		for (int z=0;z<numPlayers;z++) {
			char ch=getPlayerChar(z);
			s=s+ch+":"+ points[z] +" ";
		}
        s=s+"\n\n";
        
        String _screen = "";

        // game-specific
        _screen=_screen+"[Waiting]\n";
        for (int i = 1; i <= numPlayers; ++i) {
            if (!flags[i - 1] || i == curPlayerID + 1) {
                _screen=_screen + getPlayerChar(i - 1) + " ";
            }
        }
        _screen = _screen + "\n\n";

        // pre-defined
        s=s+_screen;
        if (!isCompleted) {
            s=s+"*** Current player "+getPlayerChar(curPlayerID);
        }

        if (isCompleted) {
            if (winnerID < 0) {
                s = s + "*** Draw";
            } else {
                s=s+"*** Winner: "+getPlayerChar(winnerID);
            }
        }
        
		return s;
    }

    public boolean isValidCombination(boolean[] isCardSelected) {
        // pre-defined
        Hand curPlayCards = new Hand(curPlayerID, getPlayerChar(curPlayerID));
        Vector<Card> curCards = hands[curPlayerID].cards;
        for (int pos = 0; pos < curCards.size(); ++pos) {
            if (isCardSelected[pos]) {
                curPlayCards.addCard(curCards.get(pos));
            }
        }
        boolean _valid = false;

        // game-specific
        if (curPlayCards.cards.size() == 0) {
            _valid = true;
            flags[curPlayerID] = false;

            Card c = deck.drawCard();
            hands[curPlayerID].addCard(c);
            int rank = hands[curPlayerID].cards.get(hands[curPlayerID].cards.size() - 1).getRank();

            if (rank > 10) {
                points[curPlayerID] = points[curPlayerID] + 10;
            } else {
                points[curPlayerID] = points[curPlayerID] + rank;
            }

            if (points[curPlayerID] >= 21) {
                flags[curPlayerID] = true;
            }
        }

        // pre-defined
        return _valid;
    }

    public boolean isWinnerFound() {
        // pre-defined
        if (isCompleted) {
            return isCompleted;
        }
        isCompleted = false;
        int _winnerID = -1;

        // game-specific
        int numExit = 0;
        int numOver = 0;
        for (int i = 1; i <= numPlayers; ++i) {
            if (flags[i - 1]) {
                numExit = numExit + 1;
            }
            if (points[i - 1] >= 21) {
                numOver = numOver + 1;
            }
        }

        if (numExit == numPlayers || numExit == numPlayers - 1 && numOver == numPlayers - 1) {
            _winnerID = 0;
            int max = 0;
            for (int i = 1; i <= numPlayers; ++i) {
                if (points[i - 1] <= 21 && points[i - 1] > max) {
                    _winnerID = i;
                    max = points[i - 1];
                }
            }
            for (int i = 1; i <= numPlayers; ++i) {
                if (points[i - 1] == max && i != _winnerID) {
                    _winnerID = 0;
                    break;
                }
            }
        }
        
        // pre-defined
        if (_winnerID >= 0) {
            isCompleted = true;
            winnerID = _winnerID - 1;
        }
        return isCompleted;
    }

    public void nextTurn() {
        // pre-defined
        int _nextID = curPlayerID + 1;

        // game-specific
        _nextID = (curPlayerID + 1) % numPlayers + 1;
        while (flags[_nextID - 1]) {
            _nextID = (_nextID) % numPlayers + 1;
        }
        flags[_nextID - 1] = true;

        // pre-defined
        curPlayerID = _nextID - 1;
        ui.setCurHand(hands[curPlayerID]);
        ui.drawHand();
    }
}