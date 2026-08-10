class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> st= new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i])){
                return nums[i];
                
            }
            st.add(nums[i]);
        }
        return  -1;
    }
}
