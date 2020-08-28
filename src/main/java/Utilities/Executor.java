package Utilities;

import Commands.Command;

import java.util.Stack;

public class Executor {
    private Stack<Command> commands;
    private Memory memory;

    public Executor(String instruction){
        this.memory = new Memory();
        this.commands = new Compiler(instruction).compile();
    }

    public void execute(){
        for (Command command : commands){
            command.execute(memory);
        }
    }
}
