/* This file was generated by SableCC (http://www.sablecc.org/). */

package cardlang.node;

import cardlang.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private PGame _game_;
    private PScreen _screen_;
    private PValid _valid_;
    private PWinnerid _winnerid_;
    private PNextid _nextid_;

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") PGame _game_,
        @SuppressWarnings("hiding") PScreen _screen_,
        @SuppressWarnings("hiding") PValid _valid_,
        @SuppressWarnings("hiding") PWinnerid _winnerid_,
        @SuppressWarnings("hiding") PNextid _nextid_)
    {
        // Constructor
        setGame(_game_);

        setScreen(_screen_);

        setValid(_valid_);

        setWinnerid(_winnerid_);

        setNextid(_nextid_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._game_),
            cloneNode(this._screen_),
            cloneNode(this._valid_),
            cloneNode(this._winnerid_),
            cloneNode(this._nextid_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public PGame getGame()
    {
        return this._game_;
    }

    public void setGame(PGame node)
    {
        if(this._game_ != null)
        {
            this._game_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._game_ = node;
    }

    public PScreen getScreen()
    {
        return this._screen_;
    }

    public void setScreen(PScreen node)
    {
        if(this._screen_ != null)
        {
            this._screen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._screen_ = node;
    }

    public PValid getValid()
    {
        return this._valid_;
    }

    public void setValid(PValid node)
    {
        if(this._valid_ != null)
        {
            this._valid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valid_ = node;
    }

    public PWinnerid getWinnerid()
    {
        return this._winnerid_;
    }

    public void setWinnerid(PWinnerid node)
    {
        if(this._winnerid_ != null)
        {
            this._winnerid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._winnerid_ = node;
    }

    public PNextid getNextid()
    {
        return this._nextid_;
    }

    public void setNextid(PNextid node)
    {
        if(this._nextid_ != null)
        {
            this._nextid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nextid_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._game_)
            + toString(this._screen_)
            + toString(this._valid_)
            + toString(this._winnerid_)
            + toString(this._nextid_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._game_ == child)
        {
            this._game_ = null;
            return;
        }

        if(this._screen_ == child)
        {
            this._screen_ = null;
            return;
        }

        if(this._valid_ == child)
        {
            this._valid_ = null;
            return;
        }

        if(this._winnerid_ == child)
        {
            this._winnerid_ = null;
            return;
        }

        if(this._nextid_ == child)
        {
            this._nextid_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._game_ == oldChild)
        {
            setGame((PGame) newChild);
            return;
        }

        if(this._screen_ == oldChild)
        {
            setScreen((PScreen) newChild);
            return;
        }

        if(this._valid_ == oldChild)
        {
            setValid((PValid) newChild);
            return;
        }

        if(this._winnerid_ == oldChild)
        {
            setWinnerid((PWinnerid) newChild);
            return;
        }

        if(this._nextid_ == oldChild)
        {
            setNextid((PNextid) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
