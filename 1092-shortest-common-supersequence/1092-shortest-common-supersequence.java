class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();

        int dp[][]=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0|| j==0)
                dp[i][j]=i+j;
              else if(str1.charAt(i-1)==str2.charAt(j-1))
                dp[i][j] = 1 + dp[i-1][j-1];
                else
                dp[i][j]=1+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
       StringBuilder res = new StringBuilder();
        int i=m;
        int j=n;

        while(i>0 && j>0){

            if(str1.charAt(i-1)==str2.charAt(j-1)){
            res.append(str1.charAt(i-1));
            i--;
            j--;
            }
            else {
            if(dp[i-1][j]<dp[i][j-1]){
                res.append(str1.charAt(i-1));
                i--;
            }
            else{
                res.append(str2.charAt(j-1));
                j--;
            }
            }
        }
        // if s1's character is left
        while(i>0){
        res.append(str1.charAt(i-1));
        i--;
    }

    //  if s2's character is left
     while(j>0){
        res.append(str2.charAt(j-1));
        j--;
    }
        res.reverse();

        return res.toString();
    }
}