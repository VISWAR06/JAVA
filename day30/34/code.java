class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
               int i=mid,j=mid;
               while(i>0 && nums[i-1]==target)i--;
               while(j<nums.length && nums[j+1]==target)j++;
               ans[0]=i;
               ans[1]=j;
               return ans;
            }
            else if(nums[mid]<target)left=mid++;
            else if(nums[mid]>target)right=mid--;
        }
        return ans;
    }
}