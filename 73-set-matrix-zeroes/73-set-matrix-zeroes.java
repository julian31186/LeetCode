class Solution {
    public void setZeroes(int[][] matrix) {
        Stack<Integer> row = new Stack<>();
        Stack<Integer> column = new Stack<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    row.push(i);
                    column.push(j);
                }
            }
        }

        //just sauce, raw sauce
        while(!row.isEmpty()) {
         for(int j = 0; j < matrix[0].length; j++) {
                    matrix[row.peek()][j] = 0;
         }
            
          //✌\U0001f91e
            
            row.pop();
            
        }
        
        
        while(!column.isEmpty()) {
            for(int i = 0; i < matrix.length ; i++) {
                    matrix[i][column.peek()] = 0;
                
            }
            
            
          column.pop();
        }
        
        
        

        
        
        
    }
    public static void print(int [][] rectangles) {
         System.out.println(); System.out.println();
         for(int i = 0; i < rectangles.length; i++) {
           for(int j = 0; j < rectangles[i].length; j++) {
               System.out.print(rectangles[i][j] + " ");
          }
             System.out.println();
       }
    }
}