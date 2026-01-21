package assignAns;

//Implementing Shared Resource
class X {
    private boolean letterTurn = true;
    public synchronized void printNumber(int num) throws InterruptedException {
        while(letterTurn)
            wait();
        System.out.print(num+"\t");
        letterTurn = true;
        notify();

    }
    public synchronized void printLetter(char ch) throws InterruptedException {
        while(!letterTurn)
            wait();
        System.out.print(ch+"\t");
        letterTurn = false;
        notify();
    }
}


// Implementing the thread via Thread class
class Y extends Thread{
    private X printer;
    public Y(X printer) {
        this.printer = printer;
    }

    // This run() will print characters
    public void run(){
        for (char c = 'A';c <='J';c++) {
            try {
                printer.printLetter(c);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// Implementing thread va Runnable Interface
class Z implements Runnable{
    private X printer;
    public Z(X printer){
        this.printer = printer;
    }
    // This run() will print numbers
    public void run(){
        for(int i = 1; i <= 10; i++) {
            try {
                printer.printNumber(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// Main Executor
public class Task4 {
    public void ans(){
        System.out.println("Implementing the threads:\nOne thread will print A - J and other will print 1 - 10");

        // Object for shared resource
        X printer = new X();

        // creating Objects of the Classes
        Y obj1 = new Y(printer);
        Z obj2 = new Z(printer);

        // When implemented runnable, it does not contains start() and hence we pass the object to the thread object
        Thread t1 = new Thread(obj2);

        // Starting the both threads
        t1.start();
        obj1.start();
    }
}
