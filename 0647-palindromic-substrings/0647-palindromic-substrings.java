class Solution {
    int [][]t=new int[1001][1001];
    private boolean check(String str, int i, int j){
        if(i>=j)
        return true;

        if(t[i][j]!=-1)
        return t[i][j]==1;

        if(str.charAt(i)==str.charAt(j)){
           boolean ans = check(str, i + 1, j - 1);
            t[i][j] = ans ? 1 : 0;
            return ans;
        }
           
           t[i][j]=0;
          return false;
    }
    public int countSubstrings(String s) {   
        int n=s.length();
        int count=0;

        for(int []row:t)
        Arrays.fill(row,-1);

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(check(s,i,j))
                count++;
            }
        }
        return count;
    }
}