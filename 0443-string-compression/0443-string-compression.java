class Solution {
    
    class Pair {
        int amount;
        char c;
        
        public Pair(int amount, char c) {
            this.amount = amount;
            this.c = c;
        }
        
    }
    
    public int compress(char[] chars) {
        ArrayList<Pair> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while(i < chars.length) {
            Pair p = new Pair(0,chars[i]);
            while(j < chars.length) {
                if(chars[j] != chars[i]) break;
                
                p.amount += 1;
                j++;
            }
            
            list.add(p);
            i = j;
        }
        
        
        int L = 0;
        for(int k = 0; k < list.size(); k++) {
            Pair p = list.get(k);
            chars[L++] = p.c;
            
            System.out.println(p.amount);
            
            if(p.amount == 1)  {
                continue;
            } else {
                String temp = String.valueOf(p.amount);
                char [] charArr = temp.toCharArray();
                for(char x : charArr) chars[L++] = x;
                
            }
            
        }

        
        return L;
    }
}



