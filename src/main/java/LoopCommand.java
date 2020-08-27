import java.util.LinkedList;
import java.util.List;

public class LoopCommand implements Command {
    private Memory memory;
    private LinkedList<Command> commands;

    LoopCommand(Memory memory){
        this.memory = memory;
        this.commands = new LinkedList<>();
    }

    public void add(Command command){
        this.commands.add(command);
    }

    public void clear(){
        this.commands.clear();
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
