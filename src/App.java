public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(minBitFlips(10, 7));
    }

    public static int minBitFlips(int start, int goal) {
        int ans = 0; 
        // XOR will give 1 where the bits are different
        int xor = start ^ goal;

        System.out.println(xor);

        while(xor!=0){
            // If the last bit is 1, increment count 
            ans += xor & 1;

            // Right-shift to check the next bit
            xor >>=1;
        }
        return ans;
    }

    {/** WEAK SOLUTION */}
    // public static int minBitFlips(int start, int goal) {
    //     String binary1 = convertToBinary(start);
    //     String binary2 = convertToBinary(goal);

    //     System.out.println(binary1);
    //     System.out.println(binary2);

    //     if (binary1.length() > binary2.length()) {
    //         binary2 = fillGap(binary1, binary2);
    //     }else if(binary2.length() > binary1.length()){
    //         binary1 = fillGap(binary2, binary1);
    //     }

    //     return compareSteps(binary1, binary2);
    // }

    // private static String convertToBinary(int number){
    //     String binary = "";
    //     while(number != 0){
    //         binary += number%2;
    //         number = number/2;

    //         if(number == 1){
    //             binary += 1;
    //             break;
    //         }
    //     }

    //     String reversedBinary = "";
    //     for(int i = binary.length()-1; i>=0; i--){
    //         reversedBinary += binary.charAt(i);
    //     }
    //     return reversedBinary;
    // }

    // private static String fillGap(String longerBinary, String shorterBinary) {
    //     int lengthDiff = longerBinary.length() - shorterBinary.length();
    //     String newShorterBinary = "";
    //     for (int i = 0; i < lengthDiff; i++) {
    //         newShorterBinary += "0";
    //     }

    //     return newShorterBinary + shorterBinary;
    // }

    // private static int compareSteps(String binary1, String binary2){
    //     int stepCount =0;
    //     for(int i = 0; i<binary1.length(); i++){
    //         if(binary1.charAt(i) != binary2.charAt(i)){
    //             stepCount++;
    //         }
    //     }
    //     return stepCount;
    // }
}
