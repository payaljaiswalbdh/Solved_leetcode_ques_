class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n= t.size();
        int[][] dp=new int[n][n];
        int j;
        int i;

        for( i=n-1; i>=0;i--){
            dp[n-1][i] =t.get(n-1).get(i);
        }

        for( j=n-2;j>=0;j--){
            for(i=0;i<t.get(j).size();i++){
                dp[j][i]= t.get(j).get(i)+Math.min( dp[j+1][i], dp[j+1][i+1]);
            }
        }

    return dp[0][0];
        
    }
}