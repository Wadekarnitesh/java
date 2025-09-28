public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;
    static Object itr;
    int ct = 0;

    public boolean add(E o) {
        if (ct == 0) {
            head = new Node<>(o, null, null);
            tail = head;
        } else {
            Node<E> newNode = new Node<>(o, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
        ct++;
        return true;
    }

    public int size() {
        return ct;
    }

    public E next() {
        if (itr == null) itr = head;          // start from head
        if (itr == null) return null;         // empty list
        E val = ((Node<E>) itr).val;
        itr = ((Node<E>) itr).next;
        return val;
    }

    public Node<E> nextRef() {
        if (itr == null) itr = head;          // start from head
        if (itr == null) return null;
        Node<E> current = (Node<E>) itr;
        itr = current.next;
        return current;
    }

    public E prev() {
        if (itr == null) itr = tail;         
        if (itr == null) return null;
        E val = ((Node<E>) itr).val;
        itr = ((Node<E>) itr).prev;
        return val;
    }

    public Node<E> prevRef() {
        if (itr == null) itr = tail;         
        if (itr == null) return null;
        Node<E> current = (Node<E>) itr;
        itr = current.prev;
        return current;
    }

    public void iterator() {
        itr = null;   
        E val;
        while ((val = next()) != null) {
            System.out.println(val);
        }
    }

    public void reverseIterate() {
        itr = null;  
        E val;
        while ((val = prev()) != null) {
            System.out.println(val);
        }
    }
}
