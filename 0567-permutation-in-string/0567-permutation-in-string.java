class Solution {
    public boolean checkInclusion(String s1, String s2) {
         List<Integer> res = new ArrayList<>();
          int[] pfreq=new int[26];
          int[] window=new int[26];

        if(s1.length()>s2.length())
        return false;

         for (char ch : s1.toCharArray()) {
            pfreq[ch - 'a']++;
        }


        int l=0;
        int r=0;
       
        while(r<s2.length()){
            
          window[s2.charAt(r) - 'a']++;

         if((r-l+1) > s1.length()){
             window[s2.charAt(l) - 'a']--;
            l+=1;
         }
        if (r-l+1 == s1.length()){
           if (Arrays.equals(pfreq, window)) {
                    return true;
            }
        
         }
         r++;
        }

       return false; 
    }
}