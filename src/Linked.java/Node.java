public class Node<E> {
    E val;
    Node<E> prev;
    Node<E> next;

    public Node() {
    }

    public Node(E val,Node<E> prev,Node<E> next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }




}