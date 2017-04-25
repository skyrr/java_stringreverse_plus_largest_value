import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 *
 *@author Javin
**/

public class StringReverseExample {

public static void main(String args[]) throws FileNotFoundException, IOException {

//original string
    String str = "Sony is going to introduce Internet TV soon";
    System.out.println("Original String: " + str);

//reversed string using Stringbuffer
    String reverseStr = new StringBuffer(str).reverse().toString();
    System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

//iterative method to reverse String in Java
    reverseStr = reverse(str);
    System.out.println("Reverse String in Java using Iteration: " + reverseStr);

//recursive method to reverse String in Java
    reverseStr = reverseRecursively(str);
    System.out.println("Reverse String in Java using Recursion: " + reverseStr);
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max3 = Integer.MIN_VALUE;  //assuming integer elements in the array

    int theArray[] = {2,4,234,664565,76,3213,8778,231};
    for (int i = 0; i < theArray.length; i++) {
        if (theArray[i] > max1) {
            max3 = max2;
            max2 = max1;
            max1 = theArray[i];
        } else if (theArray[i] > max2) {
            max3 = max2;
            max2 = theArray[i];
        } else if (theArray[i] > max3) {
            max3 = theArray[i];
        }
    }
    System.out.println(max1 + " " + max2 + " " + max3);
}

public static String reverse(String str) {
StringBuilder strBuilder = new StringBuilder();
char[] strChars = str.toCharArray();

for (int i = strChars.length - 1; i >= 0; i--) {
strBuilder.append(strChars[i]);
}

return strBuilder.toString();
}

public static String reverseRecursively(String str) {

//base case to handle one char string and empty string
    if (str.length() < 2) {
        return str;
    }

//    System.out.println(str.charAt(0));
    return reverseRecursively(str.substring(1)) + str.charAt(0);

}
}

