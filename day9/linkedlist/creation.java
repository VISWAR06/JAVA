
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}


class Linkedlist{
    Node head,tail;
    public void add(int in){
        Node n=new Node(in);
        if(head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=n;
        }

    }
    public void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
}

}



public class creation {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add(2);
        list.add(3);
        list.add(4);
        list.disp();        
    }
    
}
