class Solution {
    public int characterReplacement(String s, int k) {
        int len=0;
        int maxlen=0;
        int left=0;
        int right=0;
        int maxfreq=0;
        int n=s.length();
        HashMap<Character,Integer> mp= new HashMap<>();
        while(right<n){
            char ch=s.charAt(right);
            char ch1= s.charAt(left);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,mp.get(ch));
            while(((right-left+1)-maxfreq)>k){
                mp.put(ch1,mp.get(ch1)-1);
                if(mp.get(ch1)==0){
                    mp.remove(ch1);
                }
                left++;
            }
            len=right-left+1;
            maxlen=Math.max(maxlen,len);
            right++;
            
        }
        return maxlen;
    }
}
