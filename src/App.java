public class App {
    public static void main(String[] args) throws Exception {
        {/* Test cases */}
        // int[] nums = new int[] { 1, 1, 0, 0, 1, 1, 1, 0, 1 };
        
        // int[] nums = new int[] { 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 516529, 516529, 516529, 516529, 516529, 516529, 516529,
        //         516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529,
        //         516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 55816, 55816, 55816,
        //         55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
        //         55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
        //         55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
        //         55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
        //         55816, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
        //         586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 232392, 232392, 294503 };
        
        // int[] nums = new int[] {311155,311155,311155,311155,311155,311155,311155,311155,201191,311155};

        int[] nums = new int[] {96317,96317,96317,96317,96317,96317,96317,96317,96317,279979};

        System.out.println(longestSubarray(nums));
    }

    {/* Good solution
        Time complexity: O(n)
        Space complexity: O(1)
    */}
    public static int longestSubarray(int[] nums) {
        int max=0,count=0,maxcount=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                count++;
            }
            else{
                maxcount=Math.max(maxcount,count);
                count=0;
            }
        }
        maxcount=Math.max(maxcount,count);
        if(maxcount==0){return 1;}
        return maxcount;
    }


    {/* Ok solution
        Time complexity: O(n)
        Space complexity: O(1)
    */}
    // public static int longestSubarray(int[] nums) {
    //     HashMap<Integer, ArrayList<Integer>> record = new HashMap<>();
    //     int largest = -1;
    //     int largestLength = 0;
    //     boolean continuos = true;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (largest < nums[i]) {
    //             largest = nums[i];
    //             largestLength = 1;
    //             if (!record.containsKey(largest)) {
    //                 ArrayList<Integer> newAL = new ArrayList<Integer>();
    //                 newAL.add(largestLength);
    //                 record.put(largest, newAL);
    //             }
                
    //             continuos = true;
    //         } else {
    //             if (largest != nums[i]) {
    //                 continuos = false;
    //             } else if (largest == nums[i] && continuos == true) {
    //                 largestLength += 1;
    //             } else if (largest == nums[i] && continuos == false) {
    //                 if (record.containsKey(largest)) {
    //                     record.get(largest).add(largestLength);
    //                 } else {
    //                     ArrayList<Integer> newAL = new ArrayList<Integer>();
    //                     newAL.add(largestLength);
    //                     record.put(largest, newAL);
    //                 }
    //                 largestLength = 1;
    //                 continuos = true;
    //             }
    //         }
    //     }
    //     int answer = largestLength;

    //     for (Map.Entry<Integer, ArrayList<Integer>> e : record.entrySet()) {
    //         if (e.getKey() >= largest) {
    //             for (Integer i : e.getValue()) {
    //                 if (i > answer) {
    //                     System.out.println(e.getKey() + " " + i + " is larger than " + largest + " " + answer);
    //                     largest = e.getKey();
    //                     answer = i;
    //                 }
    //             }
    //         }
    //     }

    //     for (Map.Entry<Integer, ArrayList<Integer>> e : record.entrySet()) {
    //         System.out.println(e.getKey());
    //         for (Integer i : e.getValue()) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }

    //     System.out.println(largest + " " + answer);

    //     return answer;
    // }

}
