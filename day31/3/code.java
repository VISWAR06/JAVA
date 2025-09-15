class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];
        int l = 0, r = 0, max = 0;

        while (r < n) {
            char c = s.charAt(r);

            // if duplicate exists, shrink window
            while (hash[c] > 0) {
                hash[s.charAt(l)]--;
                l++;
            }

            hash[c]++;  // mark current char as present
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}
