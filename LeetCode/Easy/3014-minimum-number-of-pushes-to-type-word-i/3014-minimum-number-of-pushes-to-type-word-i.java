class Solution {
    public int minimumPushes(String word) {
        int totalPush = 0;

        for(int i=0; i<word.length(); i++){
            totalPush += (i/8)+1;
        }
        return totalPush;
    }
}