class Solution {
    class Pair {
        List<Integer> coord;
        int distance;
        
        public Pair(List<Integer> coord, int distance) {
            this.distance = distance;
            this.coord = coord;
        }
        
    }
    
    public int[][] kClosest(int[][] points, int k) {
        
        List<List<Integer>> lists = new ArrayList<>();
        for(int[] c : points) {
            List<Integer> list = new ArrayList<>();
            list.add(c[0]);
            list.add(c[1]);
            lists.add(list);
        }
        
        PriorityQueue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>() {
    public int compare(Pair pair1, Pair pair2) {
        if (pair1.distance < pair2.distance) return -1;
        if (pair1.distance > pair2.distance) return 1;
        return 0;
    }
});
    
        
        for(List<Integer> c : lists) {
            Pair pair = new Pair(c, ((int)(Math.pow(c.get(0),2)) + (int)(Math.pow(c.get(1),2))));
            queue.add(pair);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            List<Integer> sublist = queue.remove().coord;
            ans.add(sublist);
        }
         
        int[][] arr = ans.stream()
    .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
    .toArray(int[][]::new);
        return arr;
    }
}