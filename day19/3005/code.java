class Solution {
    public int maxFrequencyElements(int[] nums) {
        int c=0,max=0;
        int[] hash=new int[101];
        for(int num:nums){
            hash[num]++;
            max=Math.max(max,hash[num]);
        }
        for(int cou:hash){
            if(cou==max)c+=cou;
        }
        return c;
    }
}