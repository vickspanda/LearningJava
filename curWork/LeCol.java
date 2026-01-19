package curWork;
import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.util.*;


enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

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


//
//
//    LinkedList is a part of the Java Collection Framework and is present in the java.util package. It implements a doubly-linked list data structure where elements are not stored in contiguous memory. Each node contains three parts: the data, a reference to the next node, and a reference to the previous node
//
//    Dynamic Size: LinkedList grows or shrinks dynamically at runtime.
//    Maintains Insertion Order: Elements are stored in the order they are added.
//    Allows Duplicates: Duplicate elements are allowed.
//    Not Synchronized: By default, LinkedList is not thread-safe. To make Thread-safe use of Collections.synchronizedList().
//    Efficient Insertion/Deletion: Adding or removing elements at the beginning or middle is faster compared to ArrayList.
//
//
    public void linkedList(){
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++)
            ll.add(sc.nextLine());

        System.out.println(ll);

        ll.set(2,"Sanjana");
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        for(int i=0;i<ll.size();i++)
            System.out.print(ll.get(i)+"\t");
        System.out.println();

        for (String name:ll)
            System.out.print(name+"\t");
        System.out.println();
    }

//
//    HashSet in Java implements the Set interface of the Collections Framework. It is used to store the unique elements, and it doesn't maintain any specific order of elements.
//
//    HashSet does not allow duplicate elements.
//    Uses HashMap internally which is an implementation of hash table data structure.
//    Also implements Serializable and Cloneable interfaces.
//    HashSet is not thread-safe. To make it thread-safe, synchronization is needed externally.
//
//
    public void hashSet(){
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<6;i++)
            hs.add(sc.nextLine());

        System.out.println(hs);

        hs.remove("Vikas");
        System.out.println(hs);

        // Two ways to Iterate the hashSet, Either use iterate() method or use enhanced for loop
        System.out.println("Using Iterator:\t");
        Iterator<String> iterator = hs.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next()+"\t");
        System.out.println();


        System.out.println("Using Enchanced for loop:\t");
        for(String name: hs)
            System.out.print(name+"\t");
        System.out.println();
    }
//
//    LinkedHashSet in Java implements the Set interface of the Collections Framework.
//
//    It combines the functionalities of a HashSet with a doubly-linked list to maintain the insertion order of elements.
//    LinkedHashSet stores unique elements only and allows a single null.
//    Implements Set, Cloneable and Serializable interfaces.
//
//

    public void lhs(){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
            lhs.add(sc.nextLine());

        System.out.println(lhs);

        lhs.remove("Vikas");

        // Two ways to Iterate the hashSet, Either use iterate() method or use enhanced for loop
        System.out.println("Using Iterator:\t");
        Iterator<String> iterator = lhs.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next()+"\t");
        System.out.println();


        System.out.println("Using Enchanced for loop:\t");
        for(String name: lhs)
            System.out.print(name+"\t");
        System.out.println();
    }
//
//    A TreeSet is a collection class that stores unique elements in a sorted order. It is part of java.util package that implements the SortedSet interface, and internally uses a Red-Black tree to maintain sorting.
//
//    Does not allow duplicates and null values. From JDK 7 onward, inserting null throws NullPointerException.
//    Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
//    TreeSet is not synchronized. it must be synchronized using Collections.synchronizedSet().

    public void ts() {
        TreeSet<String> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        // To add
        for (int i = 0; i < 5; i++)
            ts.add(sc.nextLine());

        System.out.println(ts);

        // To access

        System.out.println("Contains 'Vikas':\t"+ts.contains("Vikas"));
        System.out.println(ts.first());
        System.out.println(ts.last());

        // To remove
        ts.remove("Vikas");
        System.out.println(ts);

        ts.pollFirst();
        System.out.println(ts);

        ts.pollLast();
        System.out.println(ts);

        // To traverse
        System.out.println("Using Enchanced for loop:\t");
        for (String name : ts)
            System.out.print(name + "\t");
        System.out.println();

    }
//
//    A PriorityQueue in Java is a queue where elements are ordered based on their priority, rather than the order of insertion. By default, it uses natural ordering (min-heap), but a custom comparator can be used to define different priorities.
//
//    Elements are processed based on priority rather than insertion order.
//    Supports standard queue operations like add(), poll(), and peek().
//    Automatically grows as elements are added.
//    Uses a heap data structure internally to ensure efficient insertion and removal of the highest-priority element.
//

    public void pq() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        // To add
        for (int i = 0; i < 5; i++)
            pq.add(sc.nextLine());

        System.out.println(pq);

        // To access

        System.out.println("Contains 'Vikas':\t"+pq.contains("Vikas"));
        System.out.println(pq.peek());

        // To remove
        pq.remove("Vikas");
        System.out.println(pq);


        System.out.println(pq.poll());
        System.out.println(pq);


        // To traverse
        System.out.println("Using Enhanced for loop:\t");
        for (String name : pq)
            System.out.print(name + "\t");
        System.out.println();

    }
//
//    ArrayDeque is a resizable-array implementation of the Deque interface in Java. It is part of java.util package provides a double-ended queue implementation, allowing elements to be added or removed from both ends efficiently.
//
//    ArrayDeque grows dynamically.
//    It generally provides faster operations than LinkedList as it is more cache friendly and does not require overhead of next previous reference management.
//    Operations like addFirst(), addLast(), removeFirst(), removeLast() are all done in constant time O(1).
//    ArrayDeque is not Thread-Safe

    public void arrDQ(){

        Deque<String> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        //To Add
        for (int i = 0;i<5;i++)
            dq.add(sc.nextLine());
        System.out.println(dq);
        dq.addFirst("Mango");
        System.out.println(dq);
        dq.addLast("Apple");
        System.out.println(dq);
        dq.offer("Kewi");
        System.out.println(dq);

        // To Access
        System.out.println("First Element:\t"+dq.getFirst());
        System.out.println("Last Element:\t"+dq.getLast());

        // To Remove
        dq.pop();
        System.out.println(dq);
        dq.poll();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);


        // To traverse
        System.out.println("Using Enhanced for loop:\t");
        for (String name : dq)
            System.out.print(name + "\t");
        System.out.println();

    }


//    A HashMap is a part of Java’s Collection Framework and implements the Map interface. It stores elements in key-value pairs, where, Keys are unique. and Values can be duplicated.
//
//    Internally uses Hashing, hence allows efficient key-based retrieval, insertion, and removal with an average of O(1) time.
//    HashMap is not thread-safe, to make it synchronized, use Collections.synchronizedMap().
//    Insertion order is not preserved in HashMap. To preserve the insertion order, LinkedHashMap is used and to maintain sorted order, TreeMap is used.

    public void hMap(){
        HashMap<String,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // To Add
        for (int i=0;i<5;i++)
            hm.put(sc.next(), sc.nextInt());

        System.out.println(hm);

        // To Remove
        hm.remove(sc.next());
        System.out.println(hm);

        // To traverse
        for (Map.Entry<String,Integer> e: hm.entrySet())
            System.out.println("Key :\t"+e.getKey()+" Value :\t"+e.getValue());
    }


//
//    EnumMap is a specialized implementation of the Map interface for enumeration types. It extends AbstractMap and implements the Map interface in Java. It belongs to java.util package. A few important features of EnumMap are as follows:
//
//    The EnumMap class is a member of the Java Collections Framework and is not synchronized.
//    EnumMap is an ordered collection and they are maintained in the natural order of their keys (the natural order of keys means the order in which enum constants are declared inside the enum type).
//    It’s a high-performance map implementation, much faster than HashMap.
//    All keys of each EnumMap instance must be keys of a single enum type.
//    EnumMap doesn't allow a null key and throws NullPointerException when we attempt to insert the null key.
//    Iterators returned by the collection views are weakly consistent: they will never throw ConcurrentModificationException and they may or may not show the effects of any modifications to the map that occur while the iteration is in progress.
//    EnumMap is internally represented as arrays. This representation is extremely compact and efficient.


    public void eMap(){
        EnumMap<Day, String> emap = new EnumMap<>(Day.class);

        // To Add
        emap.put(Day.MON,"Start of week");
        emap.put(Day.FRI,"End of week");
        emap.put(Day.SUN,"Weekend");
        emap.put(Day.SAT,"Semi-Weekend");

        // To Access

        System.out.println("Key-Value mappings: " + emap.entrySet());
        System.out.println("Keys: " + emap.keySet());
        System.out.println("Values: " + emap.values());
        System.out.println("Value of FRI : " + emap.get(Day.FRI));


        // To Remove
        String i = emap.remove(Day.SUN);
        System.out.println("Removed Value:\t"+i);

        // To Replace
        emap.replace(Day.MON,"Great Day");
        System.out.println(emap);

        // To traverse
        for(Day day: emap.keySet())
            System.out.println(day+"\t"+emap.get(day));

    }


// The AbstractMap class is a part of the Java Collection Framework. It directly implements the Map interface to provide a structure to it, by doing so it makes the further implementations easier. As the name suggests AbstractMap is an abstract class by definition, therefore it cannot be used to create objects. The concrete classes that inherit from AbstractMap can be used to create objects.


    public void absMap(){

        AbstractMap<String,Integer> amap = new HashMap<String,Integer>();
        Scanner sc =new Scanner(System.in);


        // To Add
        for (int i=0;i<5;i++)
            amap.put(sc.next(), sc.nextInt());

        System.out.println(amap);

//        // To Remove
        amap.remove(sc.next());
        System.out.println(amap);

        // To traverse
        for (AbstractMap.Entry<String,Integer> e: amap.entrySet())
            System.out.println("Key :\t"+e.getKey()+" Value :\t"+e.getValue());

        // TO Replace
        amap.replace(sc.next(), sc.nextInt());
        System.out.println(amap);

    }

}
