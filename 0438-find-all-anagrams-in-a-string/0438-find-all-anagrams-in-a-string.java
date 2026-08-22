class Solution {
    public List<Integer> findAnagrams(String s, String p) {
          List<Integer> res = new ArrayList<>();
          int[] pfreq=new int[26];
          int[] window=new int[26];

        if(p.length()>s.length())
        return res;

         for (char ch : p.toCharArray()) {
            pfreq[ch - 'a']++;
        }


        int l=0;
        int r=0;
       
        while(r<s.length()){
            
          window[s.charAt(r) - 'a']++;

         if((r-l+1) > p.length()){
             window[s.charAt(l) - 'a']--;
            l+=1;
         }
        if (r-l+1 == p.length()){
           if (Arrays.equals(pfreq, window)) {
                    res.add(l);
            }
        
         }
         r++;
        }

       return res; 
    }
}