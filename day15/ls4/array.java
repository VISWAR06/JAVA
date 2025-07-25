package day15.ls4;

public class array {
    public static void ret(int i,int n){
        if(i>=n/2)return
        swap(arr[i],arr[n-i-1]);
        ret(i+1)
    }
    public static void main(String[] args) {
        int[] arr={3,2,5,1};
        int n=arr.length;
        ret(0,n);
        
    }
    
}
