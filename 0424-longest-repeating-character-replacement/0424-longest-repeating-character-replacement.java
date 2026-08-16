class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int i=0;
        int maxfreq=0;
        int res=0;
     for(int j=i;j<s.length();j++){
        freq[s.charAt(j)-'A']++;
           
           maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
           int windowsize=j-i+1;

           if(windowsize-maxfreq>k){
            freq[s.charAt(i)-'A']--;
            i++;
           }
           windowsize=j-i+1;
        res=Math.max(res,windowsize);
     }
        return res;
    }
}