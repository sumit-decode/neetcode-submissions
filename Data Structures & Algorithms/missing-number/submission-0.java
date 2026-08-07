class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int target=0;
        for(int i:nums){
            target+=i;
        }
        return sum-target;
    }
}
