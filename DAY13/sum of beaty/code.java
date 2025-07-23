package DAY13.sum of beaty;

class Solution {
    public int beautySum(String s) {
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min=0,max=0;
        for(int i:map.values()){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        return max-min;
        
    }
}