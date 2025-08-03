class Solution {
    public int mostWordsFound(String[] sen) {
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sen.length;i++){
            int c=1;
            char[] arr=sen[i].toCharArray();
            for(char ch:arr){
                if(ch==' ')c++;
                max=Math.max(max,c);
            }
            
        }
return max;
        
    }
}