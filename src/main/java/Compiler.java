import java.util.LinkedList;
import java.util.List;

public class Compiler {
    private String string;
    private List<Command> commands;
    private CommandsFactory commandsFactory;

    public Compiler(String string){
        this.commands = new LinkedList<>();
        this.string = string;
        this.commandsFactory = new CommandsFactory(new Memory());
    }

    public void compile(){
        for(char c : string.toCharArray()){
            Command command = commandsFactory.createCommand(c);
            commands.add(command);
        }
    }

    public void execute(){
        for (Command command : commands){
            command.execute();
        }
    }
}
