package stock buy;

class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int max = 0;
        int min = arr[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < min) min = arr[i];
            sum = arr[i] - min;
            if(sum > max) max = sum;
       }
       return max;
        
    }
}