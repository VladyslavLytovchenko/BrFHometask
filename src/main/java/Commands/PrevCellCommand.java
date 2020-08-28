package Commands;

import Utilities.Memory;

public class PrevCellCommand implements Command {

    @Override
    public void execute(Memory memory) {
        memory.prevCell();
    }
}
