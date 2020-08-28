package Commands;

import Utilities.Memory;

public class IncrementCommand implements Command {
    private Memory memory;

    public IncrementCommand(Memory memory){
        this.memory = memory;
    }

    @Override
    public void execute() {
        byte cellValue = memory.getCurrentCell();
        memory.setCurrentCell((byte) (cellValue+1));
    }
}
