class Solution {
    public boolean checkDivisibility(int n) {
        int orig = n; int DigSum=0; int DigProd =1;
        while(n>0){
            int dig = n%10;
            n /=10;

            DigSum += dig;
            DigProd *= dig;
        }
        return orig%(DigSum+DigProd) == 0;
    }
}