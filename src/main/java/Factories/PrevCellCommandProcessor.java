package Factories;

import Commands.Command;
import Commands.PrevCellCommand;

import java.util.Stack;

public class PrevCellCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        stack.peek().push(new PrevCellCommand());
    }
}
