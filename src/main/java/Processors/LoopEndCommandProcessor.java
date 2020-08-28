package Processors;

import Commands.Command;

import java.util.Stack;

public class LoopEndCommandProcessor implements CommandProcessor {
    @Override
    public void processCommand(Stack<Stack<Command>> stack) {
        stack.pop();
    }
}
