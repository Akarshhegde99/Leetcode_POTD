class Solution {
    public int findGCD(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            maxVal = Math.max(nums[i], maxVal);
            minVal = Math.min(nums[i], minVal);
        }

        ans = gcd(minVal, maxVal);
        return ans;
    }

    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}