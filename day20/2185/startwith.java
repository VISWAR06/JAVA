class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String n:words){
            if(n.startsWith(pref))
            {c++;
           
            }
        }
        return c;

        
    }
}