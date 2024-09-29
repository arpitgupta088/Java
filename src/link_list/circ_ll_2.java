//// for inesertion of node

package link_list;

import java.util.Scanner;

public class circ_ll_2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {           // Constructor
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void Creation() {
        int data, m, p, n;     // n for continue entering data
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;     // Circular linking
            } else {
                System.out.println("Enter 1 for insert node in beginning, 2 for end, 3 for specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:  // Insert at the beginning
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;  // Maintain circular property
                        break;

                    case 2:  // Insert at the end
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;  // Maintain circular property
                        break;

                    case 3:  // Insert at a specific position
                        System.out.println("Enter position of node to be inserted");
                        p = sc.nextInt();

                        if (p == 1) {
                            new_node.next = head;
                            head = new_node;
                            tail.next = head;
                        } else {
                            Node temp1 = head;
                            for (int i = 1; i < (p - 1); i++) {  // Fix loop to stop at the correct node
                                temp1 = temp1.next;
                            }
                            new_node.next = temp1.next;
                            temp1.next = new_node;
                        }
                        break;

                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
            System.out.println("Do you want to add more data? Press 1 for yes.");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void Traversal() {
        Node temp = head;

        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        circ_ll_2 L1 = new circ_ll_2();  // Correct object creation
        L1.Creation();
        L1.Traversal();
    }
}
