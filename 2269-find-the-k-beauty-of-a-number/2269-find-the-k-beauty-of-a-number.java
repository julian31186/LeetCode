class Solution {
    public int divisorSubstrings(int num, int k) {
        int result = 0;
        String numString = String.valueOf(num);
        
        int index = 0;
        
        for(int i = k-1; i < numString.length(); i++) {
            System.out.println(Integer.valueOf(String.valueOf(numString.substring(index,i+1))));
            
            
            if((Integer.valueOf(String.valueOf(numString.substring(index,i+1))) != 0)) {
               if((num % (Integer.valueOf(String.valueOf(numString.substring(index,i+1)))) == 0)) result++; 
            }
            
            
            index++;
        }
        
        
        
        return result;
    }
}