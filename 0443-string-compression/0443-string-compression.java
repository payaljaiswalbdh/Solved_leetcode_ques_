class Solution {
    public int compress(char[] chars) {
        int n= chars.length;
        int index=0;
        int i=0;
        while(i<n){
            char cur_char= chars[i];
            int count=0;
             //find count of duplicate
            while(i<n && chars[i]==cur_char){
                count++;
                i++;
            }

            //assigning code
            chars[index]=cur_char;
            index++;

            if(count>1){
                String count_str=Integer.toString(count);
                for(char ch:count_str.toCharArray()){
                    chars[index]=ch;
                    index++;
                }
            }
        }
       return index; 
    }
}