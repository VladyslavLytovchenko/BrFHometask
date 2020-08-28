import Commands.Command;
import Commands.LoopCommand;
import Commands.NextCellCommand;
import Commands.PrevCellCommand;
import Utilities.Executor;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

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