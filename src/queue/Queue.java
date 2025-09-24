public interface Queue<E>{
    int initialCap=16;

    boolean add(E ele);
    E remove();
    boolean offer(E ele);
    E peek();
    // boolean check();
    int size();

    E poll();

    String toString();
    boolean isEmpty();
    boolean equals(Object o);
    E element();

    boolean contains(E ref);
    void shuffle();
    boolean makeNextHead(E ele);
    



}