class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=1;i<n;i++)ans=doit(ans);
        return ans;
        
    }
    public String doit(String s){
        StringBuilder sb=new StringBuilder();
        int cout=1;
        char prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev)cout++;
            else{
                sb.append(cout);
                sb.append(prev);
                prev=s.charAt(i);
                cout=1;
            }
          

        }
          sb.append(cout).append(prev);
            return sb.toString();
    }
}