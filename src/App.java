import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> timePoints = Arrays.asList(new String[] { "00:00", "23:59" });
        System.out.println(findMinDifference(timePoints));
    }


    /* Good Solution
     * Time Complexity: O(n log n) -> dominated by sorting, the conversion to Minutes and finding minimum difference is O(n)
     * Space Complexity: O(n)
     */
    public static int findMinDifference(List<String> timePoints) {
        int[] minuteArray = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            String timeInHour = timePoints.get(i);
            String[] splitted = timeInHour.split(":");
            minuteArray[i] = (Integer.parseInt(splitted[0]) * 60 + Integer.parseInt(splitted[1]));
        }

        Arrays.sort(minuteArray);

        int min = 1440;

        for (int i = 0; i < minuteArray.length - 1; i++) {
            min = Math.min(min, Math.abs(minuteArray[i] - minuteArray[i + 1]));
        }

        min = Math.min(min, (1440 - Math.abs(minuteArray[0] - minuteArray[minuteArray.length - 1])));

        return min;
    }
}
