package day20.2011;

public class code {
    
}
class Solution {
    public int finalValueAfterOperations(String[] op) {
        int c=0;
        for(String s:op){
            if(s.contains("+"))c++;
            else c--;
        }
        return c;
        
    }
}