package Processors;

import Commands.Command;
import Commands.NextCellCommand;

import java.util.Stack;

public class NextCellCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        stack.peek().push(new NextCellCommand());
    }
}
