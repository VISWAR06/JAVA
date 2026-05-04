// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void ss(int[] arr,int i,ArrayList<Integer>current,int s,int sum){
        if(i==arr.length){
            if(s==sum){
            System.out.print(current);
            return;
            }
        }

        current.add(arr[i]);
        s+=arr[i];
        ss(arr,i+1,current,s,sum);
        current.remove(current.size()-1);
        s-=arr[i];
        ss(arr,i+1,current,s,sum);
    }
    public static void main(String[] args) {
      int[] arr={3,1,2};
      int sum=3;
       ArrayList<Integer> current = new ArrayList<>();
      ss(arr,0,current,0,sum);
    }
}