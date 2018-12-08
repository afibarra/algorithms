package me.afibarra;

/**
 * Simple main application
 */
public class App {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(new Node(5));
        System.out.println(list);
        list.appendNodeToTail(10);
        System.out.println(list);
        list.appendNodeToHead(25);
        System.out.println(list);
    }
}