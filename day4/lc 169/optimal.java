package day4.lc 169;

class Solution {
    public int majorityElement(int[] nums) {
       int el=0,c=0;
       for(int i=0;i< nums.length;i++){
        if(c==0){
            c=1;
            el=nums[i];
        }
        else if(el==nums[i])c++;
        else c--;
       }
       int check=0;
       for(int i=0;i<nums.length;i++){
            if(el==nums[i])check++;
       }
       if(check>nums.length/2)return el;

       return -1;
  
    }
}//moorse voting algo..