package Commands;

import Utilities.Memory;

public class PrevCellCommand implements Command {
    private Memory memory;

    public PrevCellCommand(Memory memory){
        this.memory = memory;
    }

    @Override
    public void execute() {
        memory.prevCell();
    }
}
