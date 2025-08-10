package day24.1408;

public class code {
    
}
class Solution {
    public int maxScore(String s) {
        int l=0,r=s.length()-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int one=0,ze=0;
            for(int i=0;i<=l;i++){
                if(s.charAt(i)=='0')ze++;
            }
            for(int j=l+1;j<=r;j++){
                if(s.charAt(j)=='1')one++;
            }
            l++;
            max=Math.max(max,ze+one);
        }return max;
    }
}