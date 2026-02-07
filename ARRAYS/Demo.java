import java.lang.reflect.Array;
import java.util.*;

public class Demo {

    public static String ASCIIConversion(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                result += " ";
            } else {
                result += (int) c;
            }
        }

        return result;
    }

    static int[] odd_even_transformation(int a[], int n) {
        int times = 0;
        while (times != n) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    a[i] -= 3;
                } else {
                    a[i] += 3;
                }
                times++;
            }
        }
        return a;
    }

    static List<String> getlatest(List<String> str, int k) {
        List<String> result = new ArrayList<>();
        Set<String> check = new HashSet<>();
        int cnt = 0;
        for (int i = str.size() - 1; i >= 0; i--) {
            if (cnt == k) {
                return result;
            }
            String req = str.get(i);
            if (!check.contains(req)) {
                cnt++;
                check.add(req);
                result.add(req);
            }
        }
        return result;
    }

    // static int totalerror(String product[], double[] prices, String
    // productSell[], double[] sell) {
    // int err = 0;

    // for (int i = 0; i < productSell.length; i++) {
    // String str = productSell[i];
    // for (int j = 0; j < product.length; j++) {
    // if (str.equals(product[j])) {
    // if (Math.abs(prices[j] - sell[i]) > 0.001) {
    // err++;
    // }
    // }
    // }
    // }

    // return err;
    // }
    static int totalError(String[] product, double[] prices, String[] productSell, double[] sell) {
        int err = 0;

        for (int i = 0; i < productSell.length; i++) {
            String str = productSell[i];
            for (int j = 0; j < product.length; j++) {
                if (str.equals(product[j])) {
                    // Use tolerance for double comparison
                    if (Math.abs(prices[j] - sell[i]) > 0.001) {
                        err++;
                    }
                }
            }
        }
        return err;
    }

    static int[] parrot() {
        return new int[] { 0, 1 };
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.print(ASCIIConversion(s.nextLine()));
        // int arr[] = { 3, 6, 9 };
        // int n = 3;
        // String json1 = "{\"hi\":\"hello\", \"hello\":\"world\"}";
        // String[] product = { "Milk", "Egg", "Cheese" };
        // double[] prices = { 2.89, 3.29, 5.79 };
        // String[] productSold = { "Egg", "Egg", "Cheese", "Milk" };
        // double sell[] = { 2.89, 2.99, 5.97, 3.29 };
        // int result = totalError(product, prices, productSold, sell);
        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }
        // for (String str : result) {
        // System.out.print(str + " ");
        // }
        // System.out.println(result);
        // String stri = "12345678961";
        // char[] chas = stri.toCharArray();
        // Arrays.sort(chas);
        // for (int i = 0; i < chas.length; i++) {
        // System.out.print(chas[i] + " ");
        // }
        // long n=Integer.parseInt(stri);
        // List<Character> sorting = new ArrayList<>();
        // sorting.add('A');
        // sorting.add('a');
        // sorting.add('e');
        // sorting.add('o');

        // // sorting.sort(null);
        // Collections.sort(sorting);
        // // System.out.println(sorting);
        // String str = "lEetcOde";
        // List<Character> sorted_Vowel = new ArrayList<>();

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' ||
        // str.charAt(i) == 'o'
        // || str.charAt(i) == 'u' ||
        // str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'E' ||
        // str.charAt(i) == 'O'
        // || str.charAt(i) == 'U') {
        // sorted_Vowel.add(str.charAt(i));
        // }
        // }
        // Collections.sort(sorted_Vowel);
        // int j = 0;
        // char[] de = str.toCharArray();
        // for (int i = 0; i < de.length; i++) {
        // if (de[i] == 'a' || de[i] == 'i' || de[i] == 'e' || de[i] == 'o'
        // || de[i] == 'u' ||
        // de[i] == 'A' || de[i] == 'I' || de[i] == 'E' || de[i] == 'O'
        // || de[i] == 'U') {
        // if (!sorted_Vowel.isEmpty()) {
        // de[i] = sorted_Vowel.get(j);
        // sorted_Vowel.remove(j);
        // }
        // }
        // }
        // System.out.println(new String(de));
        // StringBuilder result = new StringBuilder();
        // for (int i = 0; i < de.length; i++) {
        // // System.out.print(de[i] + " ");
        // result.append(de[i]);
        // }
        // HashSet<Character> seen = new HashSet<>();
        // seen.add('a');
        // seen.add('e');
        // seen.add('c');

        // System.out.println(result.toString());
        // String str = "hello";
        // HashMap<Character, Integer> sum = new HashMap<>();

        // for (int i = 0; i < str.length(); i++) {
        // sum.put(str.charAt(i), sum.getOrDefault(str.charAt(i), 0) + 1);
        // }
        // System.out.println(sum);
        // int count_consonant=0;
        // int count_vowel=0;
        // int i=0;
        // int n = 11;
        // Map<Integer, Integer> add = new LinkedHashMap<>();
        // for (int i = 2; i < n; i++) {
        // if (!add.containsKey(n - i) && !add.containsValue(n - i)) {
        // add.put(n - i, i);
        // }
        // }

        // // Get last entry
        // Map.Entry<Integer, Integer> last = null;
        // for (Map.Entry<Integer, Integer> e : add.entrySet()) {
        // last = e; // keep updating until last
        // }

        // // Convert to 2D array
        // int[][] result = { { last.getKey(), last.getValue() } };

        // System.out.println(Arrays.deepToString(result));
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> trai = new ArrayList<>();
        trai.add(2);
        trai.add(3);
        trai.add(4);
        while (!trai.isEmpty()) {
            System.out.println(trai.get(0));
            trai.remove(0);
        }
        int n=Integer.MIN_VALUE;
        // for (int i = 0; i < triangle.size(); i++) {
        // List<Integer> tr = triangle.get(i);
        // System.out.println(tr);
        // }
    }
}