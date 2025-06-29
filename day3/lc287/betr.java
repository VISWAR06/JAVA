package lc287;

class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==0){
                freq[nums[i]]+=1;
            }
            else return nums[i];
        }
return 0;

        
    }
}