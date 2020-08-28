package Factories;

import Commands.Command;
import Commands.LoopCommand;

import java.util.Stack;

public class LoopBeginCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        LoopCommand loopCommand = new LoopCommand();
        stack.peek().push(loopCommand);
        stack.push(loopCommand.getCommands());
    }
}
