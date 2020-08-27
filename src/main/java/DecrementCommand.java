public class DecrementCommand implements Command {
    private Memory memory;

    public DecrementCommand(Memory memory){
        this.memory = memory;
    }

    @Override
    public void execute() {
        byte cellValue = memory.getCurrentCell();
        memory.setCurrentCell((byte) (cellValue-1));
    }
}
