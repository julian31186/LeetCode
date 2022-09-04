class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
        LinkedList<int []> list = new LinkedList<>();
        
        for(int[] integer : intervals) {
            if(list.isEmpty() || list.getLast()[1] < integer[0]) {
                list.add(integer);
            } else {
                list.getLast()[1] = Math.max(integer[1], list.getLast()[1]);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}