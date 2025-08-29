package servicenow.day1.125;

public class Solution {
    public boolean check(String st){
        int start=0;
        int end=st.length()-1;
        while(start<end){
            if(st.charAt(start)!=st.charAt(end))return false;
            start++;
            end--;

        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char elem=s.charAt(i);
            if(Character.isDigit(elem)||Character.isLetter(elem))str.append(elem);
        }
        String result=str.toString().toLowerCase();
       return check(result);
        
    }
} {
    
}
