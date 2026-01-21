package assignAns;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

// Declared Functional Interface and used it for lambda expression
@FunctionalInterface
interface A{
    void sortArray(List<String> names);
}


class Task1 {

    //    Program using Lambda Expression to sort a list of names
    public void ans1(){
        System.out.println("Program using Lambda Expression to sort a list of names");

        // Creation of List of Names
        List<String> names = new ArrayList<>();

        // Assignment of Names
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
            names.add(sc.nextLine());

        // Printing List Before Sorting
        System.out.println("Before sorting:\t"+ names);

        // Declared Lambda Function for sorting
        A obj = (arr) -> arr.sort((s1,s2) -> s1.compareTo(s2));

        // Printing List After Sorting
        obj.sortArray(names);
        System.out.println("After sorting:\t"+ names);

    }

// Program to filter even numbers from a list and print them using Stream API
    public void ans2(){
        System.out.println("Program to filter even numbers from a list and print them using Stream API");

        // Creation of List of Numbers
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Value assignment
        for (int i=0;i<6;i++)
            list.add(sc.nextInt());

        // Printing Original List
        System.out.println("Original List:\t"+list);

        // elements of list are sent as streams with the help of stream()
        // filter is applied to stream, checking for the even number
        // the outputs from the filter are now used for printing
        list = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        // Printing Final list with filter applied.
        System.out.println("Only Even Numbers List:\t"+list);
    }

    // Program to see how Optional handles null values safely
    public void ans3(){
        System.out.println("Program to see how Optional handles null values safely");

        // Creation of List of Numbers
        String[] list = new String[5];
        Scanner sc = new Scanner(System.in);

        // Assigning the values
        for (int i=0;i<4;i++)
            list[i] = sc.nextLine();

        // In an array of five, only four were initialized

        //Now I have tried to apply toLowerCase for the original size of the Array
//        for (String s : list)
//            System.out.println(s.toLowerCase());

        // Now using Optional to avoid such case
        for (String s: list){
            // for each element, check was made whether the value was null or not
            Optional<String> check = Optional.ofNullable(s);

            // Conditionally utilized the values
            if(check.isPresent())
                System.out.println(s.toLowerCase());
            else
                System.out.println("Word is null");

        }


    }

    public void ans4(){
        System.out.println("The Demonstration for Functional Interface is only in the ans, when lambda expression is implemented");
        System.out.println("Functional interface  is an interface that has only one abstract method, making it suitable for use with lambda expressions and method references (introduced in Java 8)");
    }
}
