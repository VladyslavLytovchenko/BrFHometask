import java.util.*;

public class BrainFuck {

    public static void main(String[] args) {
       Compiler compiler = new Compiler(">++++++++[<+++++++++>-]<.>>+>+>++>[-]+<[>[->+<<++++>]<<]>.+++++++..+++.>>+++++++.<<<<+++++++++++++.>>.+++.------.----.>>+.>++++.");
       compiler.execute();
    }
}