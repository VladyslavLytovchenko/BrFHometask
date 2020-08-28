package Factories;

import Commands.Command;
import Commands.PrintCommand;

import java.util.Stack;

public class PrintCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        stack.peek().push(new PrintCommand());
    }
}
