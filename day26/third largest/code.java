class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>lar){
                third=sec;
                sec=lar;
                lar=num;
            }
            else if(num>sec && num<lar){
                third=sec;
                sec=num;
            }
            else if(num>third && num<sec)third=num;
        }
        return third;
    }
}