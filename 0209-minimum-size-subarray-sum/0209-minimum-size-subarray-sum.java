class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int ans=Integer.MAX_VALUE;
       int i=0;
       int j=0;
       while(i<=j && j<n){
          sum=sum+nums[j];
        while(sum>=target){
        int curr=j-i+1;
        ans=Math.min(ans,curr);
        sum=sum-nums[i];
        i++;
       }
    j++;
       }

         if(ans==Integer.MAX_VALUE)
         return 0;
         else
         return ans;
    }
}