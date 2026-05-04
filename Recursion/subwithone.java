public class Subsequence with sum one time {
     public static boolean ss(int[] arr,int i,ArrayList<Integer>current,int s,int sum){
     if(i==arr.length){
            if(s==sum){
            System.out.print(current);
            return true;
            }
            else return false;
        }

        current.add(arr[i]);
        s+=arr[i];
      if ( ss(arr,i+1,current,s,sum)==true)return true;
        current.remove(current.size()-1);
        s-=arr[i];
       if ( ss(arr,i+1,current,s,sum)==true)return true;
       return false;
       
    }
    public static void main(String[] args) {
      int[] arr={3,1,2};
      int sum=3;
       ArrayList<Integer> current = new ArrayList<>();
      ss(arr,0,current,0,sum);
    }
}
