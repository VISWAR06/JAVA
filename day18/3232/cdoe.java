class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int last=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                sum+=nums[i];
            }
            else last+=nums[i];
            
        }
        if(sum==last)return false;
        else if(sum>last)return true;
        return true;
        
    }
}