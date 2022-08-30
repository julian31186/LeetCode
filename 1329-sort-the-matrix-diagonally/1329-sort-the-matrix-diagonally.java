class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                map.putIfAbsent(i - j , new PriorityQueue<Integer>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = map.get(i-j).poll();
            }
        }
        return mat;
    }
}