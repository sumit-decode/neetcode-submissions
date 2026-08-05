class Pair{
    int freq;
    int ele;
    Pair(int e, int f){
        this.ele=e;
        this.freq=f;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)-> a.freq-b.freq
        );
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            int element=entry.getKey();
            int freq=entry.getValue();
            Pair p= new Pair(element,freq);
            if(pq.size()<k){
                pq.offer(p);
            }
            else if(p.freq>pq.peek().freq){
                pq.poll();
                pq.offer(p);
            }
        }
        int ans[]= new int[k];
        int i=0;
        while(!pq.isEmpty()){
            Pair p= pq.poll();
            ans[i++]=p.ele;
        }
        return ans;

    }
}
