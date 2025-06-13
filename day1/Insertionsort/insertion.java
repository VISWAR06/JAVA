package Insertionsort;
import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int j=i-1;
            int val=arr[i];
            while(j>=0 && val<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);

            
        }

    }
}
