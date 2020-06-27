package stack;


public class LinkedList {
    List head;
    static int cnt;
    LinkedList(){
        head=new List();
        cnt=0;
    }
    void push(String sx){
        ++cnt;
        List node=new List(sx);
        node.next=head;
        head=node;
    }
    void pop(){
        --cnt;
        System.out.println(head.s);
        head=head.next;
    }
}
