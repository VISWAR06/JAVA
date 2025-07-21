package day11.valid anagram];

class Solution {
    public boolean isAnagram(String s, String t) {
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);
        return Arrays.equals(a,b);
}
}