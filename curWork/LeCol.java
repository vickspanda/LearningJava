package curWork;
import java.util.ArrayList;
import java.util.Scanner;


//An ArrayList in Java is a resizable (or dynamic) array from the java.util package that can grow or shrink automatically as elements are added or removed, unlike regular arrays with a fixed size.
//
//Indexed Access: Elements can be accessed using their index, just like arrays.
//Allows Duplicates: Duplicate elements are allowed.
//Maintains Insertion Order: Elements are stored in the order they are inserted.
//Not Synchronized: ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually using Collections.synchronizedList().

public class LeCol {
    public void arrayList(){
        ArrayList<String> arr1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6;i++)
            arr1.add(sc.nextLine());

        System.out.println(arr1);

        arr1.remove(1);
        System.out.println(arr1);

        arr1.set(4,"Vikas Sharma");
        System.out.println(arr1);

        arr1.remove("Vikas Sharma");
        System.out.println(arr1);

        arr1.add(2,"Akshay Dhamne");
        System.out.println(arr1);

    }
}
