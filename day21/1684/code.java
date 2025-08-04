class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0,not=0;
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            boolean flag=true;
            for(int j=0;j<temp.length();j++){
                if(!allowed.contains(String.valueOf(temp.charAt(j)))){
                    flag=false;
                    break;
                }
            
            }
            if(flag)c++;
        }
        
        return c;
    }
}