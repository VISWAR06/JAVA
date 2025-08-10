package day24.771;

public class code {
    
}
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum=0;
        for(char ch2:jewels.toCharArray()){
            if(map.containsKey(ch2)){
                sum+=map.get(ch2);
            }
        }
        return sum;
        
    }
}