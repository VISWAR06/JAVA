class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        char chart='a';
        for(int i=26;i>=1;i--){
            map.put(chart,i);
            chart++;
        }
        int mul=1,sum=0;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            mul=(i+1)*map.get(temp);
            sum+=mul;
        }
        return sum;
        
    }
}