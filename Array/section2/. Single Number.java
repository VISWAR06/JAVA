package Array.section2;

public class . Single Number {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }
    for(int i:map.keySet())if(map.get(i)==1)return i;
    
}
