//Q.21)Reverse a linked list


class ReverseLinkedList {

    static Node head;

    static class Node {
        int data;
        Node nextNode;
//creating parameterized cons of Node class
        Node(int d) {
            data = d;
            nextNode = null;
        }
    }

    Node reverse(Node node) {
        Node previousNode = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.nextNode;
            current.nextNode = previousNode;
            previousNode = current;
            current = next;
        }
        node = previousNode;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.nextNode;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList myList = new ReverseLinkedList();
        myList.head = new Node(20);
        myList.head.nextNode = new Node(30);
        myList.head.nextNode.nextNode = new Node(45);
        myList.head.nextNode.nextNode.nextNode = new Node(55);

        System.out.println("Linked list before reversal: ");
        myList.printList(head);
        head = myList.reverse(head);
        System.out.println("");
        System.out.println("Linked list after reversal: ");
        myList.printList(head);
    }
}