class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      k=k%n;
      if(n>k){
         swap(nums,0,n-1);
      swap(nums,0,k-1);
      swap(nums,k,n-1);
      }
     

    }
    public static void swap(int[] arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}