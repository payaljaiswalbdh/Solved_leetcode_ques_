class Solution {
    public int maximumProduct(int[] nums) {
        int s=1;
        int c=1;
        int n=nums.length;
        Arrays.sort(nums);
        c=nums[0]*nums[1]*nums[n-1];
        s=nums[n-1]*nums[n-2]*nums[n-3];
        if(s>c)
        return s;
        else
        return c;
    }
}