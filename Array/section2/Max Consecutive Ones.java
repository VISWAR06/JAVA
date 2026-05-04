package Array.section2;

public class Max Consecutive Ones {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)c++;
            else c=0;
            max=Math.max(c,max);
        }
        return max;
    }
}

