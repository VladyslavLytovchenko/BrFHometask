import Utilities.Executor;

public class BrainFuckMain {

    public static void main(String[] args) {
       Executor executor = new Executor("+[>+++++<-]>[<+++++>-]+<+[" +
               ">[>+>+<<-]++>>[<<+>>-]>>>[-]++>[-]+" +
               ">>>+[[-]++++++>>>]<<<[[<++++++++<++>>-]+<.<[>----<-]<]" +
               "<<[>>>>>[>>>[-]+++++++++<[>-<-]+++++++++>[-[<->-]+[<<<]]<[>+<-]>]<<-]<<-" +
               "]");
       executor.execute();
    }
}