package Commands;

import Utilities.Memory;

public class NextCellCommand implements Command {

    @Override
    public void execute(Memory memory) {
        memory.nextCell();
    }
}
