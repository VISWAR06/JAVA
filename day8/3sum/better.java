package day8.3sum;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                Set<List<Integer>>set=new HashSet<>();
                int third=0;
                for(int i=0;i<nums.length;i++){
                    Set<Integer>remv=new HashSet<>();
                    for(int j=i+1;j<nums.length;j++){
                        third=-(nums[i]+nums[j]);
                        if(remv.contains(third)){
                            List<Integer>list=Arrays.asList(nums[i],nums[j],third);
                            list.sort(null);
                            set.add(list);
                        }remv.add(nums[j]);
                    }
                    
                }
                List<List<Integer>>ans=new ArrayList<>(set);
                return ans;
          
        
    }
}
