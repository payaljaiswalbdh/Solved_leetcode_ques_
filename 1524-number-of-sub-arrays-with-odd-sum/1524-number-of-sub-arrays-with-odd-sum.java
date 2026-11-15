class Solution {
    public int numOfSubarrays(int[] arr) {
        //approach 1 : prefix sum + Parity Counting having tc o(n) and sc O(n)
    // int n = arr.length;
    //     int mod = 1000000007;

    //     int[] prefix = new int[n];

    //     prefix[0] = arr[0];

    //     for (int i = 1; i < n; i++) {
    //         prefix[i] = prefix[i - 1] + arr[i];
    //     }

    //     long count = 0;
    //     long odd = 0;
    //     long even = 1; // Empty prefix has sum 0 (even)

    //     for (int i = 0; i < n; i++) {

    //         if (prefix[i] % 2 != 0) {
    //             // Odd prefix - pair with previous even prefixes
    //             count = (count + even) % mod;
    //             odd++;
    //         } else {
    //             // Even prefix - pair with previous odd prefixes
    //             count = (count + odd) % mod;
    //             even++;
    //         }
    //     }

    //     return (int) count;


 //approach 1 : Prefix Sum + Parity Counting approach without using a prefix array having tc o(n) and sc O(1)
  int mod = 1000000007;

        long count = 0;
        long odd = 0;
        long even = 1;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum % 2 != 0) {
                // Current prefix is odd
                count = (count + even) % mod;
                odd++;
            } 
            else {
                // Current prefix is even
                count = (count + odd) % mod;
                even++;
            }
        }

        return (int) count;
    }
}
