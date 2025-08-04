class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(String s:words){
            int fl=1;
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))){
                    fl=0;
                    break;
                }
            }c+=fl;
        }
        
        return c;
    }
}