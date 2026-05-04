class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        for(int n:nums){
            if(!set.contains(n)){
                set.add(n);
            
            nums[i]=n;
            i++;}
        }
        return i;
    }
}