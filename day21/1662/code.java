class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(String s:word1)str1.append(s);
        System.out.print(str1);
        for(String s2:word2)str2.append(s2);
        System.out.print(str2);
        if(str1!=str2)return false;
        return true;

        
    }
}