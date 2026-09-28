class Solution {
    public static boolean checkFreq(String s) {
    int[] arr = new int[26];
    
    for (char ch : s.toCharArray()) {
        arr[ch - 'a']++;
    
   if(  arr[ch - 'a']>1)
    return true; 
    }

return false;
}
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
                    return false;
                }
        if (s.equals(goal)) {
            return checkFreq(s);
        }

        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                index.add(i);
            }
        }

     if (index.size() == 2) {
            int i = index.get(0);
            int j = index.get(1);
            return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
        }

        return false;
        
    }
}