class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res= new StringBuilder();
        String s1=s.toLowerCase().trim();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
        }
        String org= res.toString();
        String rev=res.reverse().toString();
        if(org.equals(rev)){
            return true;
        }
        return false;
    }
}
