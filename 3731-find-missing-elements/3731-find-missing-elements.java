class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minn= Integer.MAX_VALUE;
        int maxx= Integer.MIN_VALUE;
        HashMap<Integer, Boolean> freq= new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,true);
            maxx=Math.max(maxx,i);
            minn= Math.min(minn,i);
        }
         List<Integer> res= new ArrayList<>();
        for(int i=minn;i<=maxx;i++){
         if(!freq.containsKey(i))
            res.add(i);
        }
        return res;

    }
}