package queue;

public class LinkedList {
    List head, data;
    static int cnt;
    LinkedList(){
        head=new List();
        data=head;
        cnt=0;
    }
    void push(String sx){
        ++cnt;
        List node=new List(sx);
        head.next=node;
        head=node;
    }
    void pop(){
        --cnt;
        data=data.next;
        System.out.println(data.s);
    }
}
