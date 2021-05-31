package com.company;

public final class Macbook extends Notebook{
    private String model;
    private String CPU;

    public Macbook(Color color, Age age, int memory, boolean isHaveTouchId, String model, String CPU) {
        super(color, age, memory, isHaveTouchId);
        this.model = model;
        this.CPU = CPU;
    }

    public String getModel() {
        return model;
    }

    public String getCPU() {
        return CPU;
    }
    public void printInfo (){
        super.printInfo();
        System.out.println("  model "+getModel()+ "  CPU " + getCPU());
    }
    public void copyElements(Macbook macbook){
        this.model = macbook.getModel();
    }
}
