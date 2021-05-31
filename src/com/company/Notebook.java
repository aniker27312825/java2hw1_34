package com.company;

public class Notebook extends Gadget {
    private int memory;
    private boolean isHaveTouchId;

    public Notebook(Color color, Age age, int memory, boolean isHaveTouchId) {
        super(color, age);
        this.memory = memory;
        this.isHaveTouchId = isHaveTouchId;
    }

    public int getMemory() {
        return memory;
    }

    public boolean isHaveTouchId() {
        return isHaveTouchId;
    }

    public void printInfo(){
        System.out.println("age "+getAge().getAge()+"  color "+ getColor()+" memory "+ getMemory()+"  touchID "+isHaveTouchId());
    }
    public void printInfo(Color color, int memory){
        System.out.println("Color "+ color+ "  Memory" + memory);
    }

    public final void printInfo(int memory){
        System.out.println("  Memory " + memory);
    }
}
