import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        String allowed = "abc";
        String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        System.out.println(countConsistentStrings(allowed, words));
    }


    {/* Good Solution
        Time_complexity : O((words.length*(lengthiest string in words).length)
        Space complexity: O(1)
    */}
    public static int countConsistentStrings(String allowed, String[] words) {
        int allowedCount = 0;
        Set<Character> allowedSet = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        for (String word : words) {
            boolean isAllowed = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isAllowed = false;
                    break;
                }
            }
            if (isAllowed) {
                allowedCount++;
            }
        }
        return allowedCount;
    }


    {/* Weak Solution 
        Time Complexity: O(n)
        Space Complexity: O(n)
    */}
    // public static int countConsistentStrings(String allowed, String[] words) {
    //     int allowedCount = 0;
    //     Set<Character> allowedSet = new HashSet<>();

    //     allowedSet.addAll(convertStringToCharList(allowed));

    //     for (String word : words) {
    //         Set<Character> wordSet = new HashSet<>();
    //         wordSet.addAll(convertStringToCharList(word));

    //         Set<Character> difference = new HashSet<Character>(wordSet);
    //         difference.removeAll(allowedSet);

    //         if (difference.isEmpty()) {
    //             allowedCount++;
    //         }
    //     }
    //     return allowedCount;
    // }

    // private static List<Character> convertStringToCharList(String text) {
    //     char[] charArray = text.toCharArray();
    //     return IntStream.range(0, charArray.length).mapToObj(i -> charArray[i]).collect(Collectors.toList());

    // }
}
