class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int zero=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0)zero++;
                if(zero<=k){
                    max=Math.max(max,j-i+1);

                }
                else{
                    break;
                }
            }
        }
        return max;
        
    }
}