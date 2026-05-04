public class Lower {
    int[] nums;
        int n=0,left=0,right=nums.length-1,ans=n;
        while(left<=right){
            int mid=left+ (right-left)/2;
          if(nums[mid]>=n){
            ans=mid;
            right=mid-1;
          }else{
            left=mid+1;
          }
        }
    
}
