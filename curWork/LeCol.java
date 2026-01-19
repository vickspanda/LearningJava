package curWork;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.Stack;

public class LeCol {

//    """An ArrayList in Java is a resizable (or dynamic) array from the java.util package that can grow or shrink automatically as elements are added or removed, unlike regular arrays with a fixed size.
//
//    Indexed Access: Elements can be accessed using their index, just like arrays.
//    Allows Duplicates: Duplicate elements are allowed.
//    Maintains Insertion Order: Elements are stored in the order they are inserted.
//    Not Synchronized: ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually using Collections.synchronizedList()."""

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
        System.out.println("The Name at 5th Index:\t"+arr1.get(4));


    }

//    """
//      In Java, a Vector is a dynamic array that can grow or shrink in size as elements are added or removed. It is part of the java.util package and extends the AbstractList class.
//
//      Maintains insertion order and allows duplicate and null values.
//      Dynamically grows its size when capacity is exceeded.
//      Implements List, RandomAccess, Cloneable, and Serializable interfaces.
//      Vector is a Legacy class that was introduced in early versions of Java.
//      Thread-safe: All methods are synchronized for safe multithreaded access.
//      ArrayList is preferred over vector in general when in-built thread synchronization is not required.
//      """



    public void vectorList(){
        Vector<String> arr = new Vector<>(3);
        System.out.println("Initial Capacity: "+arr.capacity());
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6;i++)
            arr.add(sc.nextLine());
        System.out.println("Capacity after adding names: "+arr.capacity());

        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);
        System.out.println("Capacity after removing name: "+arr.capacity());


        arr.set(4,"Vikas Sharma");
        System.out.println(arr);

        arr.remove("Vikas Sharma");
        System.out.println(arr);

        arr.add(1,"Akshay");
        System.out.println(arr);

        System.out.println("The Name at 5th Index:\t"+arr.get(4));
    }

//    In Java, a Stack is a linear data structure that follows the Last In First Out (LIFO) principle and is defined in the java.util package. Internally, it extends the Vector class.
//
//    Stack class maintains insertion order and allows duplicates and null values.
//    Grows dynamically when its capacity is exceeded.
//    All the methods of Stack are synchronized. It is thread-safe.
//    Stack is considered a legacy class, introduced in early versions of Java and a preferred solution to implement Stack Data Structure (especially when thread synchronization is not needed) is either to use ArrayDeque or LinkedList
//    Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.
//

    public void stack(){
        Stack<String> arr = new Stack<>();
        System.out.println("Initial Capacity: "+arr.capacity());
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++)
            arr.push(sc.nextLine());

        System.out.println(arr);

        arr.pop();
        System.out.println(arr);

        arr.remove("Vikas Sharma");
        System.out.println(arr);

        System.out.println("The Name at Peek:\t"+arr.peek());
    }
}
