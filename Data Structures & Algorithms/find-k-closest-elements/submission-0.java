class Pair{
    int element;
    int diff;
    Pair(int ele, int d){
        this.element=ele;
        this.diff=d;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)-> {
                if(a.diff!=b.diff){
                    return b.diff-a.diff;
            }
            return a.element-b.element;
            }
        );
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            Pair p=new Pair(arr[i],diff);
            if(pq.size()<k){
                pq.offer(p);
            }
            else{
                if((pq.peek().diff>p.diff )||
                (pq.peek().diff==p.diff && pq.peek().element>p.element)){
                    pq.poll();
                    pq.offer(p);
                }
            }

        }
        ArrayList<Integer> ls= new ArrayList<>();
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            ls.add(p.element);

        }
        Collections.sort(ls);
        return ls;
        
    }
}