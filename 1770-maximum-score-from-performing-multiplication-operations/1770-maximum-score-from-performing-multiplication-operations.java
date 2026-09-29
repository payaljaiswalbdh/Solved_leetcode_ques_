class Solution {
    public int maximumScore(int[] nums, int[] mult) {
        int m=nums.length;
        int n=mult.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                int left=nums[j]*mult[i]+dp[i+1][j+1];
                int r=m-1-(i-j);
                int right=nums[r]*mult[i]+dp[i+1][j];
                dp[i][j]=Math.max(left,right);
            }
        }


        return dp[0][0];
    }
}