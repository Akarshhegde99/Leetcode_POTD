class Solution {
    public int gcdOfOddEvenSums(int n) {
        int SumOdd = n*(2*1+(n-1)*2)/2;
        int SumEven = n*(2*2+(n-1)*2)/2;

        return gcd(SumOdd, SumEven);
    }

    public int gcd(int a, int b){
        if (b==0)
         return a;
        else return gcd(b,a%b);
    }
}