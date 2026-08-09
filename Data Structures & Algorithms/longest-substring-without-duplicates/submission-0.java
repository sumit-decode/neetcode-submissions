class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int maxLen=0;
        int left=0;
        int right=0;
        int n=s.length();
        HashSet<Character> st =new HashSet<>();
        while(right<n){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            len=right-left+1;
            maxLen=Math.max(len,maxLen);
            right++;
        }
        return maxLen;
    }
}
