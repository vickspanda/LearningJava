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
            System.out.print("Enter Your Choice\t");
            choice = sc.nextInt();
            demo.demo(choice);
        }while (choice!=0);

    }
}
