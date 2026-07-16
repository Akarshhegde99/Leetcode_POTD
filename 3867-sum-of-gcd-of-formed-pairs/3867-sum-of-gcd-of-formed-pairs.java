class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        int prefixGCD[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
            prefixGCD[i] = gcd(nums[i],max);
        }

        Arrays.sort(prefixGCD);
        long ans = 0;

        for(int i=0, j=nums.length-1; i<j; i++,j--){
            ans += gcd(prefixGCD[i],prefixGCD[j]);
        }
        return ans;
    }

    public int gcd(int a, int b){
        if (b==0) return a;
        else return gcd(b, a%b);
    }
}