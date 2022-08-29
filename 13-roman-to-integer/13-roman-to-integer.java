class Solution {
    public int romanToInt(String s) {
        //else if for each and check prev character also check if its not at 0 and add accordifnly
        int res = 0;
        
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == 'I') res +=1; 
            if(s.charAt(i) == 'V')  {
                res +=5;    
                if(i != 0 && s.charAt(i-1) == 'I') {
                    res-=1;
                    i--;
                }
            
            }
            if(s.charAt(i) == 'X'){
                res +=10;   
                if(i != 0 && s.charAt(i-1) == 'I') {
                    res-=1;
                    i--;
                }
            }
            
            if(s.charAt(i) == 'L') {
                res +=50;   
                if(i != 0 && s.charAt(i-1) == 'X') {
                    res-=10;
                    i--;
                } 
            }
            if(s.charAt(i) == 'C') {
                res +=100;  
                if(i != 0 && s.charAt(i-1) == 'X') {
                    res-=10;
                    i--;
                } 
            }
            if(s.charAt(i) == 'D') {
                res +=500; 
                if(i != 0 && s.charAt(i-1) == 'C') {
                    res-=100;
                    i--;
                } 
            }
            if(s.charAt(i) == 'M') {
                res +=1000;
                if(i != 0 && s.charAt(i-1)== 'C') {
                    res-=100;
                    i--;
                } 
            }


    }
   return res;
}
}
   
