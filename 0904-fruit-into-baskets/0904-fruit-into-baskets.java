class Solution {
    public int totalFruit(int[] fruits) {
        // approach-1 (two pointer and hashMap O(n^2));

//         int n=fruits.length;
//         int res=0;
//            for(int i=0;i<n;i++){
//              HashMap<Integer, Integer> freq= new HashMap<>();
//               for(int j=i;j<n;j++){
//                freq.put(fruits[j],freq.getOrDefault(fruits[j],0)+1);
//                 if(freq.size()>2)
//                 break;
//    res= Math.max(res,j-i+1);
//             }
//         }
//         return res;


// Approach -2 (sliding window and hashmap, O(n))
           int n=fruits.length;
           int res=0;
           int i=0;
         HashMap<Integer, Integer> fq= new HashMap<>();
              for(int j=0;j<n;j++){
                fq.put(fruits[j],fq.getOrDefault(fruits[j],0)+1);
            while(fq.size()>2){
                fq.put(fruits[i],fq.get(fruits[i])-1);
                if(fq.get(fruits[i])==0)
                fq.remove(fruits[i]);
                i++;
            }
                res=Math.max(res,j-i+1);
           }
           return res;
    }
}