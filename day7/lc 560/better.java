package day7.lc 560;

public class better {
    public int sort(int[] nums,int t){
    int sum=0,ans=0;
    for(int i=0;i<n;i++){
        sum=0;
        for(int j=i;j<n;j++){
            sum+=nums[j];
            if(sum==t)ans++
        }
    }
    return ans;
}
    
}
