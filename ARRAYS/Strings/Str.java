import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Str {
    static String Reverse(String str) {
        int n = str.length();
        StringBuilder str2 = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            str2.append(str.charAt(i));
        }
        return (str2.toString());
    }

    static String rotate(String str, int k) {
        // Can Use Replace also.
        StringBuilder st = new StringBuilder(str);
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char a = str.charAt(i);
            int x = (i + 1) % n;
            st.setCharAt(x, a);
        }
        return (st.toString());
    }

    static boolean Palidrome(String str) {
        String rev = Reverse(str);
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    static void lengthOfLastWord(String s) {
        char space = ' ';
        // String[] words = s.split(space);
        // for (int i = 0; i < words.length; i++) {
        // System.out.print(words[i]);
        // }
        int lastwordLength = 0;
        for (int i = 0; i < s.length(); i++) {
            lastwordLength++;
            if (space == s.charAt(i)) {
                lastwordLength = 0;
            }
        }
        System.out.println(lastwordLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reverse in String
        // Rotate in String
        // Plaidrome in String
        // 242. Valid Anagram Done
        // 796 Done
        // 1903
        // 58 Done
        // 151 Done
        // 2586
        // 3

        String str = new String("Meet");
        // String reverse = Reverse(str);
        // System.out.print("Reverse of String " + str + " is:" + reverse);
        String rotate = rotate(str, 2);
        System.out.println("\nThe Rotation of a String" + str + " is:" + rotate);

        // if (Palidrome(str)) {
        //     System.out.println("The String " + str + " is Plaidrome.");
        // } else {
        //     System.out.println("The String " + str + " is Not  Plaidrome.");
        // }
        // char arr[] = str.toCharArray();
        // Arrays.sort(arr);
        // System.out.println(arr[0]);
        // lengthOfLastWord(" My name is : Meetaaasdasd is");
        // sc.close();
        



    }
}
