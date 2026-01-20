package lestring;

import java.util.Arrays;

public class learningString {
    public void basicOps(){
        // String Initialization
        String s = "Vikas";

        // Use concat() method for string concatenation
        s = s.concat(" Sharma");
        System.out.println(s);

        // String Initialization
        String s1 = "Vikas";
        String s2 = " Sharma";

        // Concatenate the strings s1 and s2 using the concat() method and store the result back in s1.
        s1 = s1.concat(s2);

        System.out.println(s1);

        String s3 = "Mr. ";
        s1 = s3.concat(s1);
        System.out.println(s1);

        // Length Function
        System.out.println("Length of string is:\t"+s1.length());

        // Uppercase and lowercase
        System.out.println(s1.toLowerCase()+"\t"+s1.toUpperCase());

        // Find char in string
        System.out.println("The char 'a' is at "+s1.indexOf('a')+" index");
        System.out.println("String contains Sharma:\t"+s3.contains("Sharma"));

        // to access character at specific index
        System.out.println("The "+s1.charAt(10)+" is at 10 index");

        // Comparing Strings
        String txt1 = "Vikas";
        String txt2 = "Vikas";

        String txt3 = "Great ings";
        String txt4 = "Greetings";

        // compareTo
        System.out.println(txt1.compareTo(txt2));
        System.out.println(txt3.compareTo(txt4));


        // equals
        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        // Removing Whitespace
        String txt = "   Vikas Sharma   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");

    // Addition of strings
        String n1 = "10";
        String n2 = "30";
        n1 = n2 + n1;
        System.out.println(n1);

        // Special Characters
        String sen = "We are the so-called \"Vikings\" \\ from the north. It's alright";
        System.out.println(sen);

        // Unicode of the character in the string
        System.out.println("Unicode: "+sen.codePointAt(1));

        // create String of char array
        char[] str1 = {'H','e','l','l','o'};
        String str2 = "";
        System.out.println("Chat Array to String:\t"+str2.copyValueOf(str1));


        // endsWith
        System.out.println("S1 ends with ma:\t"+s1.endsWith("ma"));


        // startsWith
        System.out.println("S1 starts with Mr:\t"+s1.startsWith("Mr"));

        // format
        String sem = "Hello %s! One kilobyte is %,d bytes";
        System.out.println("Format:\t"+String.format(sem,"World",1024));

        //getBytes
        byte[] res1 = s3.getBytes();
        System.out.println("getBytes: ");
        System.out.println(Arrays.toString(res1));

        //getChars
        char[] arr = {'0','1','2','3','4','5','6','7','8','9'};
        String res2 = "Vikas";
        System.out.println("getChars: ");
        res2.getChars(1,3,arr,5);
        System.out.println(arr);

        // isEmpty()

        System.out.println("isEmpty:\t"+str2.isEmpty());

        // join
        str2  = String.join(" ","Vikas","Sharma","is","Great","Personality");
        System.out.println(str2);

        // replace
        System.out.println("Replace:\t"+ str2.replace('e','i'));

        //replaceAll
        String regex = "(?i)cat", str3 = "I love cats. Cats are very easy to love. Cats are very popular.";
        System.out.println("Replace All:\t"+str3.replaceAll(regex,"dog"));


        // split
        regex = "[,\\.\\s]";
        String[] arr1 = str3.split(regex);
        for (String e: arr1)
            System.out.print(e+"<->");
        System.out.println();

        // subsequence
        System.out.println("Subsequence:\t"+str3.subSequence(8,25));

        // substring
        System.out.println("Substring:\t"+str3.substring(8,35));

        // toCharArray
        arr = str3.toCharArray();
        System.out.println("toCHarArray:\t"+ Arrays.toString(arr));

        System.out.println("Value of:\t"+String.valueOf(4.5f));











    }
}
