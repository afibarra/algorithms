package me.afibarra;

public class Node {
    int data;
    Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("data=").append(data);
        sb.append(", nextNode=").append(nextNode);
        sb.append('}');
        return sb.toString();
    }
}
