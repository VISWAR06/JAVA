package day8.4sum;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int l=j+1;
                int r=n-1;
                while(l<r){
                    long sum=nums[i];
                     sum+=nums[j];
                     sum+=nums[l];
                    sum+=nums[r];
                    if(sum>target)r--;
                    else if(sum<target)l++;
                    else{
                        List<Integer>list=Arrays.asList(nums[i],nums[j],nums[l],nums[r]);
                        l++;
                        r--;
                        ans.add(list);
                        while(l<r && nums[l]==nums[l-1])l++;
                        while(l<r && nums[r]==nums[r+1])r--;
                        
                    }
                }
            }
        }
        return ans;
        
    }
}