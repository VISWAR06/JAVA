class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String>set=new HashSet<>();
     
        for(String a:bannedWords){
            set.add(a);
        }
        int count=0;
        for(String b:message){
            if(set.contains(b)){
                count++;
                 if(count>=2)return true;
            }
           
        }
        return false;
    }
}