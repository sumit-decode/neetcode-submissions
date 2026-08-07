class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mp= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String target=new String(ch);
            if(mp.containsKey(target)){
                mp.get(target).add(strs[i]);
            }
            else{
                mp.put(target,new ArrayList<>());
                mp.get(target).add(strs[i]);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
