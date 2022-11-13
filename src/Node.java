public final class Node {

    private final int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public boolean hasNext() {
        return (this.getNext() != null);
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getNext() {
        return this.next;
    }

    public int getValue() {
        return this.value;
    }
}
