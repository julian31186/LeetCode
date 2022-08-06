class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        Boolean [] list = new Boolean[candies.length];
        
        for(int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }  
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                list[i] = true;
            } else {
                list[i] = false;
            }
        }
        
        List<Boolean> ans = Arrays.asList(list);

        return ans;
    }
}