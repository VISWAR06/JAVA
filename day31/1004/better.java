class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,left=0,right=0,zero=0;
        while(right<nums.length){
            if(nums[right]==0)zero++;
            while(zero>k){
                if(nums[left]==0)zero--;
                left+=1;
            }
            max=Math.max(max,right-left+1);
    
            right+=1;
        }
        return max;
        
    }
}