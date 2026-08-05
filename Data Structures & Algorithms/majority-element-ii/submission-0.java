class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashSet<Integer> st= new HashSet<>();
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>nums.length/3){
                st.add(nums[i]);
            }
        }
        ArrayList<Integer> ls= new ArrayList<>(st);
        return ls;
    }
}