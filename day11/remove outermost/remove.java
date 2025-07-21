package day11.remove outermost;

class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split("\\s++");
        StringBuilder a=new StringBuilder();
for(int i=word.length-1;i>=0;i--){
a.append(word[i]);
if(i!=0){
    a.append(" ");
}
}
return a.toString();
    }
}