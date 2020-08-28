package Utilities;

import Commands.*;
import Factories.*;

import java.util.HashMap;
import java.util.Stack;

public class Compiler {
    private String instruction;
    private static HashMap<Character, CommandProcessor> factories = new HashMap<>(){};

    static {
        factories.put('+', new IncrementCommandProcessor());
        factories.put('-', new DecrementCommandProcessor());
        factories.put('>', new NextCellCommandProcessor());
        factories.put('<', new PrevCellCommandProcessor());
        factories.put('[', new LoopBeginCommandProcessor());
        factories.put(']', new LoopEndCommandProcessor());
        factories.put('.', new PrintCommandProcessor());
    }

    public Compiler(String instruction) {
        this.instruction = instruction;
    }

    public Stack<Command> compile() {
        Stack<Stack<Command>> stack = new Stack<>();
        stack.push(new Stack<>());
        CommandProcessor commandProcessor;
        for (char c : instruction.toCharArray()) {
            commandProcessor = factories.get(c);
            commandProcessor.processCommand(stack);
        }
        return stack.pop();
    }

}
