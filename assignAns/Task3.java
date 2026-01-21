package assignAns;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    // This is the Function which returns true if the passed character is vowel else false
    boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        return false;
    }

    // This the Function which counts the number of vowels in the String after asking you for feeding the string
    void countVowels(){

        int count = 0;
        System.out.print("Enter the String for counting variables:\t");
        Scanner sc = new Scanner(System.in);

        // String is getting initialized
        String str = sc.nextLine();

        // looping over each character in the String with isvowel to get the count
        for(int i=0; i < str.length(); i++)
            if (isvowel(str.charAt(i)))
                count++;

        // Printing the Final answer
        System.out.println("Count of vowels:\t"+count);
    }

    // Function demonstrating the use of subString(), replace(), equalsIgnoreCase(), split() and trim()
    void demo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:\t");
        String str1 = sc.nextLine();

        // subString()
        System.out.println("Substring for the provided String");
        System.out.print("Enter starting Index:\t");
        int start = Integer.parseInt(sc.nextLine());
        System.out.print("Enter ending Index:\t");
        int end = Integer.parseInt(sc.nextLine()); ;
        System.out.println("Substring:\t"+str1.substring(start,end));

        // split()
        System.out.print("Splitting of String\nEnter the Sentence:\t");
        str1 = sc.nextLine();
        String regex = "[,\\.\\s]";
        String[] arr = str1.split(regex);
        System.out.println("String After getting split");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // replace()
        System.out.println("Replacing the characters in String");
        System.out.print("Enter the String:\t");
        str1 = sc.nextLine();
        System.out.print("Enter the character to replace:\t");
        String ch1 = sc.nextLine();
        System.out.print("Enter the character to replace with:\t");
        String ch2 = sc.nextLine();
        System.out.println("String after replacement;\t"+str1.replace(ch1,ch2));

        // equalsIgnoreCase
        System.out.println("Check Equals or not");
        System.out.print("Enter the First String\t");
        str1 = sc.nextLine();
        System.out.print("Enter the Second String\t");
        String str2 = sc.nextLine();
        System.out.println("Strings are same (ignoring case sensitive):\t"+str1.equalsIgnoreCase(str2));

        // trim()
        System.out.println("Triming the String");
        String txt = "   Vikas Sharma   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");

    }
}
