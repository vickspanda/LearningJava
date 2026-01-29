package com.panda.vicks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// This keyword is used to tell SpringBoot to create object of this class as well
@Component
public class Dev {

    @Autowired // If we use @Autowired here with the variable, it is Field Injection
    @Qualifier("desktop") // Qualifier tells which dependency to be injected if Interface Data type is defined
    private Computer comp;

    // If we use Constructor to Inject the Dependency, it is Constructor Injection
//    public Dev(Laptop laptop) {
//        this.lap = laptop;
//    }

    // If we use @Autowired with the Setter Method, It is Setter Injection
//    @Autowired
//    public void setLaptop(Desktop lap){
//        this.comp = lap;
//    }

    // It is just demo logger
    public void tell(String arg){
        System.out.println("From Dev Class:\t"+arg);
    }

    // Feature of the Developer
    public void build(){

        this.tell("I am developing the code very well ... !!!");
        comp.compile();
        comp.debug();
    }
}
