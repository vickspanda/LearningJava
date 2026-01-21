package assignAns;

import java.util.Scanner;

public class Main {

    void demo(int choice){
        // This demonstrates the task based on the choice passed
        switch(choice){
            // It is the exit choice
            case 0 :
                System.out.println("Exiting");
                break;
            case 1 : // Task 1
                Task1 task1 = new Task1();
                task1.ans1();
                task1.ans2();
                task1.ans3();
                task1.ans4();
                break;
            case 2 : // Task 2
                // Constructing the objects for Employee
                Employee emp1 = new Employee("Vikas Sharma","Jammu",25,15000);
                System.out.println(emp1);
                // Comparing both objects
                Employee emp2 = new Employee("Vikas Sharma","Jammu",23,15000);
                System.out.println("Emp1 is same as Emp2:\t"+emp1.equals(emp2));
                // getting the hashCode for the Object
                System.out.println("Hashcode for Emp:\t"+ emp1.hashCode());
                break;
            case 3 :
                // Task 3
                Task3 task3 = new Task3();
                task3.demo();
                task3.countVowels();
                break;
            case 4 :
                // Task 4
                Task4 task4 = new Task4();
                task4.ans();
                break;
            case 5 :
                // Task 5
                Task5 task5 = new Task5();
                task5.ans1();
                task5.ans2();
                task5.ans3();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args){

        // Preparing for scanning the input
        Scanner sc = new Scanner(System.in);
        Main demo = new Main();

        // Printing the options
        System.out.println("1.\tTask 1");
        System.out.println("2.\tTask 2");
        System.out.println("3.\tTask 3");
        System.out.println("4.\tTask 4");
        System.out.println("5.\tTask 5");
        System.out.print("Enter Your Choice\t");
        // storing user's choice
        int choice = sc.nextInt();
        // executing the choice
        demo.demo(choice);

    }
}
