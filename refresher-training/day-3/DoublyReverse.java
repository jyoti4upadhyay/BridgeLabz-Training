class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    DoublyLinkedListNode(int data) {
        this.data = data;
    }
}

public class DoublyReverse{

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode currnode = head;
        DoublyLinkedListNode prev = null;
        DoublyLinkedListNode next = null;

        while (currnode != null) {
            next = currnode.next;
            currnode.next = prev;
            prev = currnode;
            currnode = next;
        }

        head = prev;
        return head;
    }

    public static void printList(DoublyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedListNode head = new DoublyLinkedListNode(1);
        DoublyLinkedListNode second = new DoublyLinkedListNode(2);
        DoublyLinkedListNode third = new DoublyLinkedListNode(3);
        DoublyLinkedListNode fourth = new DoublyLinkedListNode(4);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        head = reverse(head);

        printList(head);
    }
}