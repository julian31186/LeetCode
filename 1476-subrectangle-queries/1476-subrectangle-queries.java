class SubrectangleQueries {
    int [][] rectangles;
    
    public SubrectangleQueries(int[][] rectangle) {
        rectangles = rectangle;
       
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        
        for(int i = row1; i <= row2; i++) {
           for(int j = col1; j <= col2; j++) {
               rectangles[i][j] = newValue;
          }
       }
       
    }
    
    public int getValue(int row, int col) {
        return  rectangles[row][col];
        
    }
    
    public static void print(int [][] rectangles) {
         System.out.println(); System.out.println();
        int count = 0;
         for(int i = 0; i < rectangles.length; i++) {
           for(int j = 0; j < rectangles[i].length; j++) {
               if(count == 3) {
                   System.out.println();
                   count = 0;
               }
               count++;
               System.out.print(rectangles[i][j] + " ");
          }
       }
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */