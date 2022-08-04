class Solution {
    public void rotate(int[][] matrix) {
       int [][] temp = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
           for(int j = 0; j < matrix.length; j++) {
               temp[i][j] = matrix[i][j];
           }
       } 
        
       for(int i = 0; i < matrix.length; i++) {
           for(int j = 0; j < matrix.length; j++) {
               matrix[i][j] = temp[j][i];
           }
       } 
        printMatrix(matrix);
        System.out.println();
        
       for(int k = 0; k < matrix.length; k++) {
           int i = 0;
           int j = matrix.length-1;
           while(i < j) {
               int tempNum = matrix[k][i];
               matrix[k][i] = matrix[k][j];
               matrix[k][j] = tempNum;
               i++;
               j--;
           }
           
       }
      
       printMatrix(matrix);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void printMatrix(int [][] transpose) {
         int count = 0;
         for(int i = 0; i < transpose.length; i++) {
           for(int j = 0; j < transpose[i].length; j++) {
               System.out.print(transpose[i][j] + " ");
               count++;
               if(count == 3) {
                   count = 0;
                   System.out.println();
               } 
           }
       } 
    }
}