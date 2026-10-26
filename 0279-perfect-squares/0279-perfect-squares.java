class Solution {
    int[]dp;

    public int solve(int n){
        int count=0;
        int ans=Integer.MAX_VALUE;
        if(n<=0)
        return 0;
        if(n==1 )
        return 1;
        if(n==2)
        return 2;
        if(dp[n]!=-1)
        return dp[n];
        for(int i=1;i*i<=n;i++){
            count = 1+solve(n-(i*i));
            ans=Math.min(ans,count);
        }
       return dp[n]=ans;
    }
    public int numSquares(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
       int res= solve(n);
       return res;
        
    }
}