package letcode2149
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s=nums.length/2;
        int[] pos=new int[s];
        int[] neg=new int[s];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if( nums[i]>0)
            {pos[]=nums[i];
            p++;}
            else {
                neg[n]=nums[i];
                n++;}
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0)nums[i]=pos[i];
            else nums[i]=neg[i];
        }
        return nums;
    }
}