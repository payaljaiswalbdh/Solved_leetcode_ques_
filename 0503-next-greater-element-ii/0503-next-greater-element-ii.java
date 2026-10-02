class Solution {
    public int[] nextGreaterElements(int[] nums) {
          int n=nums.length;
          int[] res =new int[n];

          Arrays.fill(res,-1);

        Stack<Integer> st= new Stack<>();
        for(int i=n-2;i>=0;i--){
            st.push(nums[i]);
        }

            for (int i = n - 1; i >= 0; i--) {
                    while(!st.isEmpty() && st.peek() <= nums[i]) {
                    st.pop();
                    }
                    if(!st.isEmpty()) {
                    res[i] = st.peek();
                }
                else {
                    res[i] = -1;
                }
                
                    st.push(nums[i]);
            }
      return   res;

    }
}