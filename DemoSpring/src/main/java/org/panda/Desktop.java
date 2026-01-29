package org.panda;

public class Desktop implements Computer {
    // Constructor
    public Desktop(){
        this.tell("Constructor Block ... !!!");
    }
    // It is demo logger method
    public void tell(String arg){
        System.out.println("From Des Class:\t"+arg);
    }

    // Feature of the Laptop
    public void compile(){
        this.tell("Compiling the Work done by the Dev ...!!!");
    }

    // Feature of the Laptop
    public void debug(){
        this.tell("Debugging the Work done by the Dev ...!!!");
    }
}
