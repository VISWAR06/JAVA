class Solution {
    public int countPrefixSuffixPairs(String[] word) {
        int c=0;
        int n=word.length;
        for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(word[j].startsWith(word[i]) && word[j].endsWith(word[i]))c++;
                }
        }
        return c;
    }
}