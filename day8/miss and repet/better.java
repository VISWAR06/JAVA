package day8.miss and repet;

class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        int miss=-1,repet=-1;
        for(int i=1;i<=n;i++){
            if(hash[i]==2)repet=i;
            if(hash[i]==0)miss=i;
            if(repet!=-1 && miss!=-1)break;
        }
        return new int[]{repet,miss};

    }
}