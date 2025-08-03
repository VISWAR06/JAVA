class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder st=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                c++;
                if(c==k)return st.toString();
            }
            st.append(ch);
        }
       return st.toString(); 
    }
}