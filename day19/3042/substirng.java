class Solution {
    public int countPrefixSuffixPairs(String[] word) {
        int c=0;
        int n=word.length;
        for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                 int len=word[i].length();
                 int len2=word[j].length();
                 if(len<=len2){
                    String a=word[j].substring(0,len);
                    String b=word[j].substring(len2-len);
                    if(a.equals(word[i])&& b.equals(word[i]))c++;
                 }
        }
     
    }   return c;
}
}