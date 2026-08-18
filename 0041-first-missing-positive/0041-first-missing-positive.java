class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=1;
        while(map.containsKey(i))
        i++;


        return i;

        
    }
}