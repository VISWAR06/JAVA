package DAY13.string to int;

class Solution {
    public int myAtoi(String s) {
       s= s.trim();
        if(s.length()==0)return 0;
        int index=0,sign=1;
        long result=0;

        if(s.charAt(index)=='+')index++;
        else if(s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        while(index<s.length() && Character.isDigit(s.charAt(index))){
            int digit=s.charAt(index)-'0';
            result=result*10+digit;
            if(sign==1 && result>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            else if(sign==-1 && -result<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            index++;
        }
        return(int) result*sign;
        
    }
}