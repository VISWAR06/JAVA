class Solution {
    public int maxScore(int[] nums, int k) {
        int left=0,right=0,max=0;
        for(int i=0;i<k;i++){
            left+=nums[i];
        }
        max=left;
        int ri=nums.length-1;
        for(int i=k-1;i>=0;i--){
            left-=nums[i];
            right+=nums[ri];
            ri-=1;
            max=Math.max(max,left+right);

        }
        return max;
    }
}