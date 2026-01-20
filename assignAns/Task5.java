package assignAns;

import java.util.*;

public class Task5 {
    void ans1(){
        System.out.println("Creation of List for Names");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Names");

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            arr.add(sc.nextLine());

        System.out.println("Array Before Sorting:\t"+arr);
        arr.sort(String::compareTo);
        System.out.println("Array After Sorting:\t"+arr);
    }

    void ans2(){

        System.out.println("Creation of HashMap for Roll Nos. and Names");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No and Name");


        HashMap<Integer,String> hashMap = new HashMap<>();

        for (int i = 0; i < 5; i++)
            hashMap.put(sc.nextInt(),sc.nextLine());

        System.out.println("HashMap:\t"+hashMap);

        System.out.print("Enter the Roll No. to get the Name of the student:\t");
        int key = Integer.parseInt(sc.nextLine());
        System.out.println("For Roll No "+key+" Student's Name is "+hashMap.get(key));
    }

    void ans3(){
        System.out.println("HashSet usage");
        List<Integer> list = Arrays.asList(1,2,5,3,5,3,5,6,4,8,9,0,1,6);

        System.out.println("Before removing Duplicate Elements:\t"+list);

        HashSet<Integer> hashSet = new HashSet<>();
        for(int e : list)
            hashSet.add(e);

        System.out.println("After removing Duplicate Elements:\t"+hashSet);
    }
}
