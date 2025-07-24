package day 14.recurseion;

public class lr1 {
    public static void f(){
        int c=0;
        if(c==10)return;
        System.out.print(c);
        c++;
        f();
    }
    public static void main(String[] args) {
        f();
    }
    
}
