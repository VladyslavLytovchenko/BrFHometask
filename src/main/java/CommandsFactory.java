import java.util.LinkedList;

public class CommandsFactory {
    private Memory memory;
    private String string;

    public CommandsFactory(String string, Memory memory) {
        this.memory = memory;
        this.string = string;
    }

    public LinkedList<Command> createCommands() {
        LinkedList<LinkedList<Command>> linkedList = new LinkedList<>();
        linkedList.add(new LinkedList<>());
        int loopNum = 0;
        for (char c : string.toCharArray()) {
            if (c == '+') {
                linkedList.get(loopNum).add(new IncrementCommand(memory));
            } else if (c == '-') {
                linkedList.get(loopNum).add(new DecrementCommand(memory));
            } else if (c == '>') {
                linkedList.get(loopNum).add(new NextCellCommand(memory));
            } else if (c == '<') {
                linkedList.get(loopNum).add(new PrevCellCommand(memory));
            } else if (c == '.') {
                linkedList.get(loopNum).add(new PrintCommand(memory));
            } else if (c == '[') {
                LoopCommand loopCommand = new LoopCommand(memory);
                linkedList.get(loopNum).add(loopCommand);
                linkedList.add(loopCommand.getCommands());
                loopNum++;
            } else if (c == ']') {
                loopNum--;
                linkedList.removeLast();
            } else {
                throw new RuntimeException("Illegal character in the algorithm");
            }
        }
        return linkedList.get(0);
    }

}
