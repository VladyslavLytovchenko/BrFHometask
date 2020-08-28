public class Memory {
    private int pointer = Short.MAX_VALUE/2;
    private byte[] memory;

    public Memory(){
        memory = new byte[Short.MAX_VALUE];
    }

    public byte getCurrentCell(){
        return memory[pointer];
    }

    public void setCurrentCell(byte value){
        memory[pointer] = value;
    }

    public void nextCell(){
        pointer++;
    }

    public void prevCell(){
        pointer--;
    }

}
