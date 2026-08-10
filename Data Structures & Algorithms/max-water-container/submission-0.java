class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int area=0;
        int maxarea=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            area=h*(right-left);
            maxarea=Math.max(area,maxarea);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;

    }
}
