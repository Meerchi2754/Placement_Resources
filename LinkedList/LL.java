import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LL {
    static String frequencySort(String s) {
        char str[] = s.toCharArray();
        HashMap<Character, Integer> freq = new HashMap<>();
        // int arr[][]=new int[128][2];
        // int x=65;
        for (int i = 0; i < str.length; i++) {
            if (freq.containsKey(str[i])) {
                int x = freq.get(str[i]);
                x++;
                freq.put(str[i], x);
            } else {
                freq.put(str[i], 1);
            }
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(freq.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue()); // descending order
        char c[] = new char[s.length()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : sortedList) {
            // System.out.println(entry.getKey() + " => " + entry.getValue());
            int x = entry.getValue();
            while (x != 0) {
                c[i] = entry.getKey();
                // System.out.print(entry.getKey());
                x--;
                i++;
            }
        }
        // System.out.println("\nThe char Arrays:");
        // for (int k = 0; k < c.length; k++) {
        // System.out.print(c[k]);
        // }
        String result = new String(c);
        return (result);
        // HashMap<Character,Integer> str2=;
    }

    public static void main(String[] args) {
        // 451 Done
        // 204
        // 206 Done
        //234 Palidrome LinkedList: Done
        //19 Done 
        //1721 Done
        //21
        //23
        // Detecting LL: 141
        String str = "aaabbbbbccc";
        // HashMap<Character,Integer> freq=new HashMap<>();
        // freq.put('a',2);
        // System.out.println(freq.get('a'));
        System.out.println(frequencySort(str)); 

    }
}