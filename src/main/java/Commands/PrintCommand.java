package Commands;

import Utilities.Memory;

public class PrintCommand implements Command {

    @Override
    public void execute(Memory memory) {
        System.out.print((char) memory.getCurrentCell());
    }
}
