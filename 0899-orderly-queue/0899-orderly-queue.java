class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }
        //case 2   k==1
        String res=s;
        int n=s.length();
        for(int i=0;i<n;i++){
            String temp=s.substring(i) + s.substring(0,i);
        if(temp.compareTo(res)<0)
            res=temp;  
        }
        return res;
        
    }
}