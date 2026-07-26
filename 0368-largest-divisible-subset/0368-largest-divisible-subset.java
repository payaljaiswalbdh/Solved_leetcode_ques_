class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

       int n=nums.length;
        int [] t=new int[n];
        Arrays.fill(t,1);

        int[] prev_idx=new int[n];
        Arrays.fill(prev_idx,-1);

        int last_index=0;
        int maxEle=1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(t[i]<t[j]+1){
                        t[i]=t[j]+1;
                        prev_idx[i]=j;
                    }

                    if(t[i]>maxEle){
                        maxEle=t[i];
                        last_index=i;
                    }
                }
            }
        }

       List<Integer> res=new ArrayList<>();
       while(last_index!=-1){
        res.add(nums[last_index]);
        last_index= prev_idx[last_index];
       }  
        return res;

    }
}