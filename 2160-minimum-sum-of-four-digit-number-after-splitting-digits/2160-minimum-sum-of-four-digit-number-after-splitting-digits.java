class Solution {
    public int minimumSum(int num) {
        int [] digits = new int [4];
        int idx = 0;
        for(int i=num; i>0; i/=10) {
            digits[idx++] = i%10;
        }
        Arrays.sort(digits);
        //System.out.printf("%s", Arrays.toString(digits));
        return (digits[0]* 10 + digits[2]) + (digits[1]*10 + digits[3]);
    }
}