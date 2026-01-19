package curWork;

abstract class Abs {
    abstract void display();
    abstract void help();
    void fund(int round){
        System.out.println("Round accepted as: "+round);
    }
}


class AbsCh extends Abs{
    @Override
    void display(){
        System.out.println("Learning Abstraction");
    }

    @Override
    void help(){
        System.out.println("Implementing the abstract method");
    }

    void onceDemo(){
        System.out.println("Inside onceDemo");
    }
}