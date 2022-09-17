class Solution {
    public void gameOfLife(int[][] board) {
        
        int [][] output = new int[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j =0; j < board[i].length; j++) {
                int check = count(board,i,j);         
                if(board[i][j] == 1 && check < 2) output[i][j] = 0;
                if(board[i][j] == 1 && (check == 2 || check == 3)) output[i][j] = 1;
                if(board[i][j] == 1 && check > 3) output[i][j] = 0;
                if(board[i][j] == 0 && check == 3) output[i][j] = 1;               
            }
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                board[i][j] = output[i][j];
            }
        }
    }
    
    public int count(int [][] board , int i , int j) {
        int [][] dimension = {{0,-1},{0,1},{1,0},{1,-1},{1,1},{-1,-1},{-1,1},{-1,0}};
        int count = 0;
        for(int [] trav : dimension) {
            int x = i + trav[0];
            int y = j + trav[1];
            if(x >= 0 && y >= 0 && x < board.length && y < board[0].length) {
                count += board[x][y];
            }
        }
        
        return count;
    }
    
    
    
    
}