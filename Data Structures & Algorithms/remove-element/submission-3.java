class Solution {
    public int removeElement(int[] nums, int val) {
        int start=-1;
        int c=0;
        for(int i:nums){
            if(i==val){
                c++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                start=i;
                break;
            }
        }
        if(start==-1) return nums.length;
        for(int j=start+1;j<nums.length;j++){
            if(nums[j]!=val){
                int temp=nums[j];
                nums[j]=nums[start];
                nums[start]=temp;
                start++;
            }
        }
        return nums.length-c;
    }
}