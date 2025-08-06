class Solution {
    public int scoreOfString(String s) {
        int minus=0,sum=0;
        for(int i=1;i<s.length();i++){
            int temp1=(int)s.charAt(i);
            int temp2=(int)s.charAt(i-1);
            sum+=Math.abs(temp1-temp2);
        }
        return sum;
        
    }
}