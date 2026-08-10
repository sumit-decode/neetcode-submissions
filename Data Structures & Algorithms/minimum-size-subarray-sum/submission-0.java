class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int n=nums.length;
        int sum=0;
        int minlen=9999;
        while(right<n){
            sum+=nums[right];
            while(sum>=target){
                sum=sum-nums[left];
              
                minlen=Math.min(minlen,right-left+1);
                  left++;
            }
           
            right++;
        }
        if(minlen==9999) return 0;
        
        return minlen;
    }
}