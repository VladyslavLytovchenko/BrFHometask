package Commands;

import Utilities.Memory;

public class NextCellCommand implements Command {
    private Memory memory;

    public NextCellCommand(Memory memory){
        this.memory = memory;
    }

    @Override
    public void execute() {
        memory.nextCell();
    }
}
