class Solution {
    public int count(String s){
        String v="aeiou";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(v.indexOf(s.charAt(i))!=-1)
            c++;
        }
        return c;
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
       int n= s.length();
        String a="";
        String b="";
            a=s.substring(0,n/2);
            b=s.substring(n/2,n);
            if(count(a)==count(b))
            return true;

        return false;
        
    }
}