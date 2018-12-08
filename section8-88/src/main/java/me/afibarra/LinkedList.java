package me.afibarra;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("The argument can't be null!");
        }

        this.head = head;
    }

    public void appendNodeToTail(int data) {
        Node newNode = new Node(data);

        while (head.nextNode != null) {
            head = head.nextNode;
        }

        head.nextNode = newNode;
    }

    public void appendNodeToHead(int data) {
        Node newNode = new Node(data);
        newNode.nextNode = this.head;

        this.head = newNode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkedList{");
        sb.append("head=").append(head);
        sb.append('}');
        return sb.toString();
    }
}
