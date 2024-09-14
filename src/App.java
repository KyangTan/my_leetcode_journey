public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] answer = xorQueries(arr, queries);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ,");
        }

        System.out.println();

        int[] arr2 = {4, 8, 2, 10};
        int[][] queries2 = {{2, 3}, {1, 3}, {0, 0}, {0, 3}};
        int[] answer2 = xorQueries(arr2, queries2);
        for (int i = 0; i < answer2.length; i++) {
            System.out.print(answer2[i] + " ,");
        }
    }

    {/* Best solution */}
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1]^arr[i];
        }
        int[] res=new int[queries.length];
        for(int k=0;k<queries.length;k++) {
            int i=queries[k][0];
            int j=queries[k][1];
            if(i==0) {
                res[k]=pre[j];
            } else {
                res[k]=pre[j]^pre[i-1];
            }
        }
        return res;
    }

    {/* Ok solution */}
    // public static int[] xorQueries(int[] arr, int[][] queries) {
    //     int[] answerArray = new int[queries.length];
    //     for (int i = 0; i < queries.length; i++) {
    //         int[] internalArray = queries[i];

    //         int start = internalArray[0];
    //         int end = internalArray[1];
    //         int answer = arr[start];
    //         for (int j = start + 1; j < end + 1; j++) {
    //             answer = arr[j] ^ answer;
    //         }
    //         answerArray[i] = (answer);
    //     }

    //     return answerArray;
    // }
}
