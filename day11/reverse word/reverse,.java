class Solution {
    public String reverseWords(String s) {
     String[] str=s.trim().split("\\s+");
     StringBuffer res=new StringBuffer();
     for(int i=str.length-1;i>0;i--){
        res.append(str[i]+" ");
     }
     res.append(str[0]);
     return res.toString();
}
}