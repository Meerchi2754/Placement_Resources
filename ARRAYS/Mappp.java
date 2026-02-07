import java.util.*;

public class Mappp {
    public static void main(String[] args) {
        Map<String, Integer> demo = new HashMap<>();
        demo.put("Meet", 21);
        demo.put("Arayan", 13);
        // List <String, List<>> temp=new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        temp.add(3);
        temp.add(4);
        System.out.println(temp.lastIndexOf(3));
        System.out.println(demo.get("Arayan"));
    }
}
