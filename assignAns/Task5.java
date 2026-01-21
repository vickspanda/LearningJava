package assignAns;

import java.util.*;

public class Task5 {
    // Sorting the ArrayList if the Names
    void ans1(){
        // Declaring the List
        System.out.println("Creation of List for Names");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Names");

        ArrayList<String> arr = new ArrayList<>();

        // Names are assigned
        for (int i = 0; i < 5; i++)
            arr.add(sc.nextLine());

        // Printing Before Sorting
        System.out.println("Array Before Sorting:\t"+arr);

        // performing sort
        arr.sort((s1,s2) -> s1.compareTo(s2));

        // After Sorting
        System.out.println("Array After Sorting:\t"+arr);
    }

    void ans2(){

        // Storing the Students name and Roll no in the hashMap
        System.out.println("Creation of HashMap for Roll Nos. and Names");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No and Name");


        HashMap<Integer,String> hashMap = new HashMap<>();

        // Values Assignment
        for (int i = 0; i < 5; i++)
            hashMap.put(sc.nextInt(),sc.nextLine());

        // Printing hashMap
        System.out.println("HashMap:\t"+hashMap);

        // Retrieving student name using the roll no as key
        System.out.print("Enter the Roll No. to get the Name of the student:\t");
        int key = Integer.parseInt(sc.nextLine());
        System.out.println("For Roll No "+key+" Student's Name is "+hashMap.get(key));
    }

    void ans3(){

        // Removed the duplicate values from the list using hashSet
        System.out.println("HashSet usage");
        // Declaring and Initialising
        List<Integer> list = Arrays.asList(1,2,5,3,5,3,5,6,4,8,9,0,1,6);

        // Printing the List
        System.out.println("Before removing Duplicate Elements:\t"+list);

        // Adding the values of List to the hashset
        HashSet<Integer> hashSet = new HashSet<>();
        for(int e : list)
            hashSet.add(e);

        // HashSet ignored Duplicate values
        System.out.println("After removing Duplicate Elements:\t"+hashSet);
    }
}
