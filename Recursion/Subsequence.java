// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void ss(int[] arr,int i,ArrayList<Integer>current){
        if(i>=arr.length){
            System.out.print(current);
            return;
        }
        current.add(arr[i]);
        ss(arr,i+1,current);
        current.remove(current.size()-1);
        ss(arr,i+1,current);
    }
    public static void main(String[] args) {
      int[] arr={3,1,2};
       ArrayList<Integer> current = new ArrayList<>();
      ss(arr,0,current);
    }
}