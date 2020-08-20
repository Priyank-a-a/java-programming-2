//Question 20)Program to return the nth node from the end in a linked list

public class NthNodeFromEndOfLl {
    static class Node {
        int data;
        Node next;
        Node(int temp) {data = temp;}
    }

    static Node findNthNodeFromEnd(Node head, int n) {

        int lengthOfLinkedList = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            lengthOfLinkedList++;
        }

        for(int i=0;i<lengthOfLinkedList-n;i++) {
            head = head.next;
        }
        return head;
    }

    public static void main(String args[]) {

        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(60);
        Node n6 = new Node(70);
        Node n7 = new Node(80);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node n = findNthNodeFromEnd(n1, 2);
        System.out.println("The returned Nth node from the end of linked list is: "+ n.data);
    }
}
