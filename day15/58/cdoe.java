public class cdoe {
    
}
class Solution {
    public int lengthOfLastWord(String s) {
        String[] trim=s.trim().split("\\s+");
        return trim[trim.length-1].length();
        
        
    }
}