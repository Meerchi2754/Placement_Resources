import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Demo {
    public static void group(String[] str) {
        // "eat","tea","tan","ate","nat","bat"
        List<List<String>> result = new ArrayList<>();
        List<String> innearlist = new ArrayList<>();
        for (int i = 0; i < str.length - 1; i++) {
            innearlist.add(str[i]);
            for (int j = i + 1; j < str.length; j++) {
                char[] first = str[i].toCharArray();
                char[] second = str[j].toCharArray();
                Arrays.sort(first);
                Arrays.sort(second);
                int count = 0;
                for (int k = 0; k < second.length; k++) {
                    if (first[k] == second[k]) {
                        count++;
                    }
                }
                System.out.println(count);
                if (count == first.length) {
                    innearlist.add(str[j]);
                    System.out.println(str[i] + " is added");
                }
            }
            result.add(innearlist);
            innearlist.removeAll(innearlist);
        }

        System.out.println(result);
    }

    public static void main(String[] arg) {

        // 1710
        // 435
        // 452
        // 621
        // 455
        // Condiotion for Greegy
        // Local Maximise lead to global Maximise.
        // Can it be divide it into Sub problem.
        // It their decision to made.
        // String t = "nagaram";
        // int count[] = new int[26];
        // for (int i : t.toCharArray()) {
        // System.out.println(i);
        // count[i - 'a']++;
        // }
        // for (int i = 0; i < count.length; i++) {
        // System.out.print(count[i] + " ");
        // }
        // for (int i : t.toCharArray()) {
        // count[i - 'a']--;
        // }
        // System.out.println();
        // for (int i = 0; i < count.length; i++) {
        // System.out.print(count[i] + " ");
        // }

        // List<List<String>> temp = new ArrayList<>();
        // List<String> innerlist = new ArrayList<>();
        // innerlist.add("Heelo World");
        // innerlist.add("Good Morning!");
        // temp.add(innerlist);
        // System.out.println(temp);
        // innerlist.removeAll(innerlist);
        // innerlist.add("Good Night!!");
        // temp.add(innerlist);
        // System.out.println(temp);
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
        group(str);
    }
}
