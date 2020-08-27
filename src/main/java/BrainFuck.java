import java.util.*;

public class BrainFuck {
    private Scanner sc = new Scanner(System.in);
    private final int LENGTH = 65535;
    private byte[] mem = new byte[LENGTH];
    private int dataPointer;

    public void interpret(String code) {
        Memory memory = new Memory();

    }

    public static void main(String[] args) {
       Compiler compiler = new Compiler("+++++++++++++++++++++++++++++++++++++++++++++" +
               "+++++++++++++++++++++++++++.+++++++++++++++++" +
               "++++++++++++.+++++++..+++.-------------------" +
               "---------------------------------------------" +
               "---------------.+++++++++++++++++++++++++++++" +
               "++++++++++++++++++++++++++.++++++++++++++++++" +
               "++++++.+++.------.--------.------------------" +
               "---------------------------------------------" +
               "----.-----------------------.");
       compiler.compile();
       compiler.execute();
    }
}