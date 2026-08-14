class Solution {
    public int lengthOfLongestSubstring(String s) {
        // approach-1
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
        HashSet<Character> set= new HashSet<>();
        for(int j=i;j<n;j++){
            if(set.contains(s.charAt(j)))
            break;
            set.add(s.charAt(j));
      res=Math.max(res,j-i+1);
        }
        }
        return res;
    }
}