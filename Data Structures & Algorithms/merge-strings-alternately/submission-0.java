class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        StringBuilder res=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            char ch=word1.charAt(i);
            res.append(ch);
            char ch1=word2.charAt(j);
            res.append(ch1);
            i++;
            j++;
        }
        while(i<word1.length()){
            char ch=word1.charAt(i);
            res.append(ch);
            i++;
        }
        while(j<word2.length()){
            char ch1=word2.charAt(j);
            res.append(ch1);
            j++;
        }
        return res.toString();
    }
}