class Solution {
    // approach-1;
//     List<String> res=new ArrayList<>();
//     private boolean isValid(String str){
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch=='(')
//             count++;
//             else
//             count--;
//             if(count<0)
//             return false;
//         }
//         return count==0;
//     }

//     private void solve(String curr, int n){
//         if(curr.length()==2*n){
//             if(isValid(curr)){
//                 res.add(curr);
//             }
//             return;
//         }
//         solve(curr + "(",n);
//         solve(curr + ")",n);
    
        
//     }
//     public List<String> generateParenthesis(int n) {
//         String curr="";

//         solve(curr ,n);

//         return res;

        
//     }
// }



// approach-2
 List<String> res=new ArrayList<>();
 private void solve(String curr, int n,int open,int close){
        if(curr.length()==2*n){
                res.add(curr);
            return;
        }
        if(open<n){    
            solve(curr + "(", n, open+1, close);
        }
        if(close<open){
        solve(curr + ")", n, open, close+1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        String curr="";
         int open=0;
         int close=0;
        solve(curr ,n,0,0);

        return res;

        
    }
}

