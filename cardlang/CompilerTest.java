package cardlang;

import cardlang.parser.*;
import cardlang.lexer.*;
import cardlang.node.*;
import java.io.*;

public class CompilerTest {
    public static void main(String[] args) {
        try {
            Parser p = new Parser(new Lexer(new PushbackReader (new FileReader(args[0]), 1024)));
            Start tree = p.parse();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}