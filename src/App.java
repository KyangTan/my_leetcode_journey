import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        // String s1 = "apple apple";
        // String s2 = "banana";

        uncommonFromSentences(s1, s2);
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordFreq1 = new HashMap<>();
        Map<String, Integer> wordFreq2 = new HashMap<>();
        String sen1Words[] = s1.split(" ");
        String sen2Words[] = s2.split(" ");
        for (var word : sen1Words) {
            wordFreq1.put(word, wordFreq1.getOrDefault(word, 0) + 1);
        }
        for (var word : sen2Words) {
            wordFreq2.put(word, wordFreq2.getOrDefault(word, 0) + 1);
        }
        List<String> uncommons = new ArrayList<>();

        for (var entry : wordFreq1.entrySet()) {
            String word = entry.getKey();
            int wordFreq = entry.getValue();
            if (wordFreq == 1 && !wordFreq2.containsKey(word)) {
                uncommons.add(word);
            }
        }

        for (var entry : wordFreq2.entrySet()) {
            String word = entry.getKey();
            int wordFreq = entry.getValue();
            if (wordFreq == 1 && !wordFreq1.containsKey(word)) {
                uncommons.add(word);
            }
        }
        return uncommons.stream().toArray(String[]::new);

    }
}
