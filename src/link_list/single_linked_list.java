package link_list;

import java.util.Scanner;
public class single_linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){           //constructor
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;

    public void Creation(){
        int data, n;     //n for continue entering data
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if(head==null){
                head = new_node;
            }
            else{
                new_node.next=head;
                head=new_node;
            }
            System.out.println("Do u want to add more data? prss 1");
            n=sc.nextInt();
        }
        while(n==1);
    }

    public void Traversal(){
        Node temp = head;
        if(head == null)
        {
            System.out.println("ll does not exist");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }
    }
    public static void main(String args[]){
        single_linked_list L1 = new single_linked_list();   //object
        L1.Creation();
        L1.Traversal();
    }
}
