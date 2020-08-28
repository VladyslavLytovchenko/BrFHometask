import java.util.LinkedList;

public class LoopCommand implements Command {
    private Memory memory;
    private LinkedList<Command> commands;

    LoopCommand(Memory memory){
        this.memory = memory;
        this.commands = new LinkedList<>();
    }

    @Override
    public void execute() {
        while (memory.getCurrentCell()!=0){
            for(Command command : commands){
                command.execute();
            }
        }
    }

    public LinkedList<Command> getCommands() {
        return commands;
    }
}
