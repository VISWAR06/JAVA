class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String n:words){
            if(n.indexOf(pref)==0)
            {c++;
           
            }
        }
        return c;

        
    }
}