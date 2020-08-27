import java.util.LinkedList;
import java.util.List;

public class Compiler {
    private String string;
    private List<Command> commands;
    private CommandsFactory commandsFactory;

    public Compiler(String string){
        this.commands = new LinkedList<>();
        this.commandsFactory = new CommandsFactory(string, new Memory());
    }


    public void execute(){
        for (Command command : commands){
            command.execute();
        }
    }
}
