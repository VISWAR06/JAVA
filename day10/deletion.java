// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class Li{
    Node head,tail;
    public void add(int a){
        Node n=new Node(a);
        if(head==null){
            head=n;
            tail=n;
            
        }else{
        tail.next=n;
        tail=n;
        }
        
    }
    public void in(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
        
    }
    public void sp(int data,int pos){
        Node n=new Node(data);
      Node temp=head;
        for(int i=0;i<pos-1;i++){
         temp=temp.next;
        }if(temp!=null){
               n.next=temp.next;
            temp.next=n;
        }
    }
    public void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public void  de(){
        head=head.next;
    }
    public void dee(){
       Node temp=head;
    while(temp.next!=tail){temp=temp.next;}
       temp.next=null;
       tail=temp;
        
    }
    public void pos(int data){
        Node temp=head;
        for(int i=0;i<data-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}
class Main {
    public static void main(String[] args) {
     Li li=new Li();
     li.add(2);
     li.add(3);
     li.add(4);
     li.de();
     
   
    
     li.disp();
    }}