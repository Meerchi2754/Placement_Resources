import java.util.*;

public class GroupAnagram {
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        System.out.println(res);
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        String[] str = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(str));
    }
}
