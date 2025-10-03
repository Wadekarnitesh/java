package linkpackage;

public class Node<E> {
    E val;
    Node<E> prev;
    Node<E> next;
    static Node itr;

    public Node() {
    }

    public Node(E val, Node<E> prev, Node<E> next) {
        super();
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    public  String toString()
    {
        return " "+val;
    }

 
    
}
