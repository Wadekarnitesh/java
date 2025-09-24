package collection1;

public  interface  ResizableArray<E> {
    int initialCap=10;
    double loadFactor=0.75;
    boolean add(E o);
    boolean add(int index,E o);
    boolean addAll(ResizableArray<E> arr);
    boolean addAll(int index, ResizableArray<E> arr);
    boolean remove(E o);
    boolean remove(int index);
    boolean removeAll(ResizableArray<E> arr);
    boolean retailAll(ResizableArray<E> arr);
    void clear();
    int size();
    boolean contains(E o);
    boolean containsAll(ResizableArray<E> arr);
    boolean isEmpty();
    Object get(int index);
    Object[] toArray();
    boolean equals(Object o);
    int hashCode();
    String toString();
    



    
}
