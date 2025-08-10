class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            set.add(n);
        }
        for(int num:nums){
            int pre=num-1;
            int next=num+1;
            if(map.get(num)==1 && !set.contains(pre) && !set.contains(next))list.add(num);
        }
        return list;
        
    }
}