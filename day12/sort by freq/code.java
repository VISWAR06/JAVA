package day12.sort by freq;

class Solution {
    public String frequencySort(String s) {
        StringBuffer str=new StringBuffer();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>list=new ArrayList(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        for(char c:list){
            for(int i=0;i<map.get(c);i++){
                str.append(c);
            }
        }
return str.toString();
    }
}