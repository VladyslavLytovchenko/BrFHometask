public class PrintCommand implements Command {
    private Memory memory;

    public PrintCommand(Memory memory){
        this.memory = memory;
    }

    @Override
    public void execute() {
        System.out.print((char) memory.getCurrentCell());
    }
}
