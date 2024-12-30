package CodingPactice;

public class ReverseLinked {

    static class LinkedList {
        static class Node { // Make Node a static nested class
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        // Function to reverse the linked list iteratively
        public void reverseIterative() {
            Node previous = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next; // Save the next node
                current.next = previous; // Reverse the link
                previous = current; // Move 'previous' one step ahead
                current = next; // Move 'current' one step ahead
            }

            head = previous; // Update the head
        }

        // Function to reverse the linked list recursively
        public Node reverseRecursive(Node current) {
            // Base case: if the list is empty or has only one node
            if (current == null || current.next == null) {
                head = current;
                return current;
            }

            // Recursive call
            Node newHead = reverseRecursive(current.next);
            current.next.next = current; // Reverse the link
            current.next = null; // Set the current node's next to null
            return newHead;
        }

        // Function to display the linked list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a sample linked list
        list.head = new LinkedList.Node(1);
        list.head.next = new LinkedList.Node(2);
        list.head.next.next = new LinkedList.Node(3);
        list.head.next.next.next = new LinkedList.Node(4);

        System.out.println("Original Linked List:");
        list.display();

        // Reverse iteratively
        list.reverseIterative();
        System.out.println("Reversed Linked List (Iterative):");
        list.display();

        // Reverse recursively
        list.reverseRecursive(list.head);
        System.out.println("Reversed Linked List (Recursive):");
        list.display();
    }
}
