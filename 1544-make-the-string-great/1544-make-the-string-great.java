class Solution {
    public String makeGood(String s) {
        StringBuilder res= new StringBuilder();

        for(char ch:s.toCharArray()){
            int len =res.length();

            if(len>0 &&  (res.charAt(len-1) + 32 == ch || res.charAt(len-1) - 32 == ch)){
                res.deleteCharAt(len-1);
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}