package Utilities;

import Commands.*;

import java.util.LinkedList;

public class Compiler {
    private Memory memory;
    private String instruction;

    public Compiler(String instruction, Memory memory) {
        this.instruction = instruction;
        this.memory = memory;
    }

    public LinkedList<Command> compile() {
        LinkedList<LinkedList<Command>> linkedList = new LinkedList<>();
        linkedList.add(new LinkedList<>());
        int loopNum = 0;
        for (char c : instruction.toCharArray()) {
            switch (c) {
                case ('+'):
                    linkedList.get(loopNum).add(new IncrementCommand(memory));
                    break;
                case ('-'):
                    linkedList.get(loopNum).add(new DecrementCommand(memory));
                    break;
                case ('>'):
                    linkedList.get(loopNum).add(new NextCellCommand(memory));
                    break;
                case ('<'):
                    linkedList.get(loopNum).add(new PrevCellCommand(memory));
                    break;
                case ('.'):
                    linkedList.get(loopNum).add(new PrintCommand(memory));
                    break;
                case ('['):
                    LoopCommand loopCommand = new LoopCommand(memory);
                    linkedList.get(loopNum++).add(loopCommand);
                    linkedList.add(loopCommand.getCommands());
                    break;
                case (']'):
                    linkedList.remove(loopNum--);
                    break;
                default:
                    throw new RuntimeException("Illegal character in the algorithm");
            }
        }
        return linkedList.get(0);
    }

}
