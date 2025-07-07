package day7.lc 128;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int ans=1,c=0,secondl=Integer.MIN_VALUE;
        Arrays.sort(nums)

;        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==secondl){
                c+=1;
                secondl=nums[i];
            }
            else if(nums[i]!=secondl){
                c=1;
                secondl=nums[i];
            }
            ans=Math.max(ans,c);
        }
        return ans;
        
    }
}