package Utilities;

import Commands.*;

import java.util.Stack;

public class Compiler {
    private String instruction;

    public Compiler(String instruction) {
        this.instruction = instruction;
    }

    public Stack<Command> compile() {
        Stack<Stack<Command>> stack = new Stack<>();
        stack.push(new Stack<>());
        for (char c : instruction.toCharArray()) {
            switch (c) {
                case ('+'):
                    stack.peek().push(new IncrementCommand());
                    break;
                case ('-'):
                    stack.peek().push(new DecrementCommand());
                    break;
                case ('>'):
                    stack.peek().push(new NextCellCommand());
                    break;
                case ('<'):
                    stack.peek().push(new PrevCellCommand());
                    break;
                case ('.'):
                    stack.peek().push(new PrintCommand());
                    break;
                case ('['):
                    LoopCommand loopCommand = new LoopCommand();
                    stack.peek().push(loopCommand);
                    stack.push(loopCommand.getCommands());
                    break;
                case (']'):
                    stack.pop();
                    break;
                default:
                    throw new RuntimeException("Illegal character in the algorithm");
            }
        }
        return stack.pop();
    }

}
