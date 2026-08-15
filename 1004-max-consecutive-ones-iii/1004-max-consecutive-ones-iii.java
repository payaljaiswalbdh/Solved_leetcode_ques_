class Solution {
    public int longestOnes(int[] nums, int k) {
        // approach -1(two pointer (O(n^2)));
        // i is fixed;
        // int n=nums.length;
        // int res=0;
        // for(int i=0;i<n;i++){
        //     int zero=0;
        //     for(int j=i;j<n;j++){
        //         // first count zero
        //         if(nums[j]==0)
        //         zero++;
                // if zero is more than k then take break;
        //         if(zero>k)
        //         break;
        //         res=Math.max(res,j-i+1);
        //     }   
        // }
        // return res;


        // Approach-2 (sliding window(O(n)));
        // i move forward and make the window valid
        // i will shrink
        int n=nums.length;
        int res=0;
        int i=0;
        int zero=0;
        for(int j=i;j<n;j++){
            if(nums[j]==0)
            zero++;
            while(zero>k){
                if(nums[i]==0)
            zero--;
            i++;
            }
            res=Math.max(res,j-i+1);
        }
        
        return res;
    }
}