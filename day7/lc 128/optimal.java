package day7.lc 128;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
      HashSet<Integer>set=new HashSet<>();
      for(int i:nums){
        set.add(i);
      }
      int ans=1,count=0;
      for(int i:set){
        if(!set.contains(i-1)){
            count=1;
            int x=i;
            while(set.contains(x+1)){
                x+=1;
                count+=1;
            }
        }
        ans=Math.max(ans,count);
      }
        return ans;
    }
}