package org.panda;


public class Dev{

    //Dependency Injection
    private Computer comp;
    private int age;
    //Dev Constructor

    public Dev(){
        this.tell("Constructor Block ... !!!");
    }

    public Dev(int age){
        this.age = age;
    }

    // It is just demo logger
    public void tell(String arg){
        System.out.println("From Dev Class:\t"+arg);
    }

    // Setter for age
    public void setAge(int age){this.age = age;}

    // Setter for age
    public void setComp(Computer comp){this.comp = comp;}

    // Getter for age
    public int getAge(){return this.age;}
    // Feature of the Developer
    public void build(){

        this.tell("I am developing the code very well ... !!!");
        comp.compile();
        comp.debug();

    }
}
