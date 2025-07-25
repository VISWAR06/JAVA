public class code {
    public  int sum(int n){
        if(n==0)return 0;
        return n+(sum-1);
    }
    public static void main(String[] args) {
        int n=4;
        Code a=new Code();
        int result=a.sum(n);
        System.out.println(a);
    }
    
}
