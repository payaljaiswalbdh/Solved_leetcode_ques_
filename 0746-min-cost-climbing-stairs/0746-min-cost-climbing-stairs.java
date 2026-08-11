class Solution {
    // memoiazation
    // int[] dp;
    // private int Solve(int[] cost, int n){
    //     if(n<0)
    //     return 0;
    //     if(n==0|| n==1)
    //       return cost[n];
    //       if(dp[n]!=0)
    //       return dp[n];

    //       return dp[n]=cost[n]+ Math.min(Solve(cost,n-1), Solve(cost,n-2));
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     int n=cost.length;
    //     dp=new int[n];
    //     return Math.min(Solve(cost,n-1), Solve(cost,n-2));
    // }

     public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            if(i<2)
            dp[i]=cost[i];
            else
            dp[i]=cost[i]+ Math.min(dp[i-1],dp[i-2]);

        }
        return Math.min(dp[n-1],dp[n-2]);
     }


}