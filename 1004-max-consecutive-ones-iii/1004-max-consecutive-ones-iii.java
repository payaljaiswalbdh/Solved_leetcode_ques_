class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=i;j<n;j++){
                // first count zero
                if(nums[j]==0)
                zero++;
                // if zero is more than k then take break;
                if(zero>k)
                break;
                res=Math.max(res,j-i+1);
            }   
        }
        return res;
        
    }
}