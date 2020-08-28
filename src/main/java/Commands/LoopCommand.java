package Commands;

import Utilities.Memory;

import java.util.Stack;

public class LoopCommand implements Command {
    private Stack<Command> commands;

    public LoopCommand(){
        this.commands = new Stack<>();
    }

    @Override
    public void execute(Memory memory) {
        while (memory.getCurrentCell()!=0){
            for(Command command : commands){
                command.execute(memory);
            }
        }
    }

    public Stack<Command> getCommands() {
        return commands;
    }
}
