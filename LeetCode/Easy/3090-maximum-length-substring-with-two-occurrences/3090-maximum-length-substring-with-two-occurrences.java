class Solution {
    public int maximumLengthSubstring(String s) {
       HashMap<Character, Integer> mp = new HashMap();
       int left =0;
       int maxLen = 0;

       for(int right=0; right<s.length();right++){
        mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
        while(mp.get(s.charAt(right))>2){
            int leftVal = mp.get(s.charAt(left))-1;
            mp.put(s.charAt(left),leftVal);
            if(mp.get(s.charAt(left))==0) {
                mp.remove(s.charAt(left));
            }
            left++;
        }
        maxLen = Math.max(maxLen, right-left+1);
       } 
       return maxLen;
    }
}

/*
i = 0;
j =0;

while(j<s.length()){
  
}


 */