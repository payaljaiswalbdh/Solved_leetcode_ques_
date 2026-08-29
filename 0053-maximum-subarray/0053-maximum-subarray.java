class Solution {
    public int maxSubArray(int[] nums) {
        int curSum=0;
        int MaxSum=nums[0];

        for(int i=0;i<nums.length;i++){
            if(curSum<0)
            curSum=0;
            curSum +=nums[i];
            MaxSum=Math.max(curSum,MaxSum);
        }
        return MaxSum;
    }
}