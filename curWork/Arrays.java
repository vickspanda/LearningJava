package curWork;

import static java.lang.Math.random;

class Arrays {

    void printArray(int [] array){
        for(int ele : array)
            System.out.print(ele+"\t");
        System.out.println();
    }
    void display(){
        int[] arr = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = (int)(random()*100);

        System.out.println("Array 1 as list: "+ java.util.Arrays.asList(arr));
        java.util.Arrays.sort(arr);
        System.out.println("Array 1 after sorting: ");
        printArray(arr);
        int [] arr2 = {1,2,3,45,6,6,7,8};
        System.out.println("Array 2");
        printArray(arr2);
        System.out.println(java.util.Arrays.compare(arr,arr2));

//        int [] [] arr3 = {{1,2,3},{2,4,6},{3,6,9}};
//        System.out.println("Array 3");
//        for(int[] ele: arr3)
//            printArray(ele);
//
//        for(int[] ele: arr3)
//            System.out.println(java.util.Arrays.toString(ele));


    }
}
