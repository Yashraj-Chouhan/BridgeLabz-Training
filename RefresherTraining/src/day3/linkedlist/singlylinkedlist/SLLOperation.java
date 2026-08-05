package day3.linkedlist.singlylinkedlist;

public class SLLOperation {

    public static void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }


    static void main() {
        Node head=null;
        Node first=new Node(10);
        Node sec=new Node(20);
        Node third=new Node(30);

        first.next=sec;
        sec.next=third;
        head=first;

        Node dummy=head;
//        while(dummy!=null){
//            System.out.println(dummy.data);
//            dummy=dummy.next;
//        }
        //print nodes




        // insert at beaganing
        Node newnode=new Node(40);
        newnode.next=head;
        head=newnode;
        Node dummy1=head;
        while(dummy1!=null){
            System.out.println(dummy1.data);
            dummy1=dummy1.next;
        }

        //delete 2nd index
        Node cu=head;

        for(int i=0;i<1;i++){
            cu=cu.next;
        }
        cu.next=cu.next.next;
        print(cu);


    }




}
