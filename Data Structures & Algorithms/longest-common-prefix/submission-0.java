class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        int n=s.length();
        String l=strs[strs.length-1];
        int m=l.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<Math.min(n,m);i++){
            if(s.charAt(i)==l.charAt(i)){
                res.append(s.charAt(i));
            }
            else{
                break;
            }
        }
       
        return res.toString();
    }
}