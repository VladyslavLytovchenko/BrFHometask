package Processors;

import Commands.Command;
import Commands.DecrementCommand;

import java.util.Stack;

public class DecrementCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        stack.peek().push(new DecrementCommand());
    }
}
