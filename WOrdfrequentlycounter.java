Wimport java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "java java collections";
        Map<String, Integer> count = new HashMap<>();

        for (String w : text.split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }

        System.out.println(count);
    }
}
