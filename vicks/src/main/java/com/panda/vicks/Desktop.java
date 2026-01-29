package com.panda.vicks;

import org.springframework.stereotype.Component;

// This keyword is used to tell SpringBoot to create object of this class as well
@Component
public class Desktop implements Computer {
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
