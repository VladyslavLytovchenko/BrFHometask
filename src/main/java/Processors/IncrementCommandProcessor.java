package Processors;

import Commands.Command;
import Commands.IncrementCommand;

import java.util.Stack;

public class IncrementCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        stack.peek().push(new IncrementCommand());
    }
}
