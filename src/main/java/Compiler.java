import java.util.LinkedList;
import java.util.List;

public class Compiler {
    private String string;
    private List<Command> commands;
    private CommandsFactory commandsFactory;

    public Compiler(String string){
        commands = (new CommandsFactory(string, new Memory())).createCommands();
    }


    public void execute(){
        for (Command command : commands){
            command.execute();
        }
    }
}
