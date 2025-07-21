package day11.longest common prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
      String ans="";
      int c=0;;
      Arrays.sort(strs);
      String first=strs[0];
      String last=strs[strs.length-1];
      for(int i=0;i<first.length();i++){
        if(i<last.length() && first.charAt(i)==last.charAt(i)){
            ans+=first.charAt(i);
        }
        else break;
      }return ans;
        
      }
     
        
    }
