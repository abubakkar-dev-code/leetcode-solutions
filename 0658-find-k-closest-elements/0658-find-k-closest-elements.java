class closestComparator implements Comparator<Integer>{

    int x;

    public closestComparator(int x){
        this.x = x;
    }

    public int compare(Integer a, Integer b){

        int diff = Math.abs(b-x) - Math.abs(a-x);

        if(diff == 0){
            return b-a;
        }

        return diff;
    }
}


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(new closestComparator(x));

        for(int num : arr){

            pq.offer(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> res = new ArrayList<>();

        while(!pq.isEmpty()){
            res.add(pq.poll());
        }

        Collections.sort(res);

        return res;
    }
}