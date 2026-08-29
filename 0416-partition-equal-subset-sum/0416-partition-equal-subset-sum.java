class Solution {
    Boolean[][] t;
    boolean solve(int[] nums, int i,int x){
        if(x==0) return true;
        if(i>=nums.length) return false;
        if(t[i][x] !=null) return t[i][x];
        boolean take=false;
        if(nums[i]<=x)
        {
            take=solve(nums,i+1,x-nums[i]);
        }

        boolean skip=solve(nums,i+1,x);
        return t[i][x]= take|| skip;

    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i:nums)
        sum+=i;

        if(sum%2!=0) return false;
       
        int x=sum/2;
        t=new Boolean [n+1][x+1];
      
        return solve(nums,0,x);
    }
}