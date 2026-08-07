class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int prod[]=new int[n];
        int lr=1,pr=1;
        for(int i=0;i<n;i++){
            lr*=nums[i];
            left[i]=lr;
        }
        for(int j=n-1;j>=0;j--){
            pr*=nums[j];
            right[j]=pr;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                prod[i]=right[i+1];
            }
            else if(i==(n-1)){
                prod[i]=left[i-1];
            }
            else{
                prod[i]=left[i-1]*right[i+1];
            }
        }
        return prod;
        

    }
}  
