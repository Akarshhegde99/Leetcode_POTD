class Solution {
    public String smallestPalindrome(String s) {
        int partition = s.length() / 2;

        char[] base = s.substring(0, partition).toCharArray();
        Arrays.sort(base);

        StringBuilder result = new StringBuilder();

        // First half (sorted)
        result.append(base);

        // Middle character (if length is odd)
        if (s.length() % 2 == 1) {
            result.append(s.charAt(partition));
        }

        // Second half (reverse of the sorted first half)
        for (int i = base.length - 1; i >= 0; i--) {
            result.append(base[i]);
        }

        return result.toString();
    }
}