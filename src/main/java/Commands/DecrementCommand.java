package Commands;

import Utilities.Memory;

public class DecrementCommand implements Command {

    @Override
    public void execute(Memory memory) {
        byte cellValue = memory.getCurrentCell();
        memory.setCurrentCell((byte) (cellValue-1));
    }
}
