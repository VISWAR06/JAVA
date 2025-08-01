class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] arr=new int[2];
        int i=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==2){
                arr[i++]=entry.getKey();
            }
            

        }
        return arr;
        
    }
}