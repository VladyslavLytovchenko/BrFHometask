import java.util.List;

public class Executor {
    private List<Command> commands;

    public Executor(String instruction){
        commands = new Compiler(instruction, new Memory())
                   .compile();
    }

    public void execute(){
        for (Command command : commands){
            command.execute();
        }
    }
}
