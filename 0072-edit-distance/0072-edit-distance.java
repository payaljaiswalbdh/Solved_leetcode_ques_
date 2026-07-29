class Solution {
    //    method 1 (recursive), memoization
       int n;
       int m;
       int t[][]=new int[501][501];
       private int solve(String s1, String s2,int i, int j){
        if(i==m){
            return n-j; //insert in s1
        }
        else if(j==n)
        {
            return m-i;  //delete from s1
        }
         if(t[i][j]!=-1){
            return t[i][j];
         }
           if(s1.charAt(i)==s2.charAt(j)){
            return t[i][j]=solve(s1,s2,i+1,j+1);
           }
           else{
            int insert= solve(s1,s2, i, j+1);
            int delete=solve(s1,s2,i+1,j);
            int replace=solve(s1,s2,i+1,j+1);
            return t[i][j]= 1 + Math.min(replace,Math.min(insert, delete));
           }

       }
       
        public int minDistance(String word1, String word2) {
           m=word1.length();
           n=word2.length();

           for(int []row:t)
           Arrays.fill(row,-1);
           return solve(word1, word2, 0, 0);
        }
}
       
       
       
       
        // method 3(bottom up)
    //     int m=word1.length();
    //     int n=word2.length();
    //     int [][]dp=new int[m+1][n+1];
    //    for(int row=0;row<=m;row++)
    //    dp[row][0]=row;

    //    for(int col=0;col<=n;col++)
    //    dp[0][col]=col;
        
    //     for(int i=1;i<m+1;i++){
    //         for(int j=1;j<n+1;j++){
    //             if(word1.charAt(i-1)==word2.charAt(j-1))
    //             {
    //                 dp[i][j]=dp[i-1][j-1];
    //             }
    //             else{
    //                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
    //             }
    //         }
    //     }
    //         return dp[m][n];



   