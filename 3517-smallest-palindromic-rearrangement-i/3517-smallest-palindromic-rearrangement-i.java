class Solution {
    public String smallestPalindrome(String s) {
        int n= s.length();
        char []arr= s.toCharArray();
        int mid=n/2;
        Arrays.sort(arr,0,mid);
        for(int i=0;i<mid;i++){
               arr[n-1-i]=arr[i];
        }
        return  new String(arr);
    }
}