package Processors;

import Commands.Command;

import java.util.Stack;

public interface CommandProcessor {
    void processCommand(Stack<Stack<Command>> stack);
}
