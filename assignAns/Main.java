package assignAns;

import java.util.Scanner;

public class Main {

    void demo(int choice){
        switch(choice){
            case 0 :
                System.out.println("Exiting");
                break;
            case 1 : Task1 task1 = new Task1();
                task1.ans1();
                task1.ans2();
                task1.ans3();
                task1.ans4();
                break;
            case 2 :
                Employee emp1 = new Employee("Vikas Sharma","Jammu",25,15000);
                System.out.println(emp1);
                Employee emp2 = new Employee("Vikas Sharma","Jammu",23,15000);
                System.out.println("Emp1 is same as Emp2:\t"+emp1.equals(emp2));
                System.out.println("Hashcode for Emp:\t"+ emp1.hashCode());
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Main demo = new Main();
        int choice;
        do
        {
            System.out.println("1.\tTask 1");
            System.out.println("2.\tTask 2");
            System.out.print("Enter Your Choice\t");
            choice = sc.nextInt();
            demo.demo(choice);
        }while (choice!=0);

    }
}
