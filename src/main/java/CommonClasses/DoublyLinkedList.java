package CommonClasses;

public class DoublyLinkedList {
    public int data;
    public DoublyLinkedList next;
    public DoublyLinkedList back;

    public DoublyLinkedList(int data1, DoublyLinkedList next1, DoublyLinkedList back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    DoublyLinkedList(int data1, DoublyLinkedList next1) {
        this.data = data1;
        this.next = next1;
        this.back = null;
    }
}
