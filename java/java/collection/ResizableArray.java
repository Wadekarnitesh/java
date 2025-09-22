package collection;

 interface  ResizableArray<E> {
    int initialCap=10;
    double loadFactor=0.75;
    boolean add(Object o);
    boolean add(int index,Object o);
    boolean addAll(ResizableArray arr);
    boolean addAll(int index, ResizableArray arr);
    boolean remove(Object o);
    boolean remove(int index);
    boolean removeAll(ResizableArray arr);
    boolean retailAll(ResizableArray arr);
    void clear();
    int size();
    boolean contains(Object o);
    boolean containsAll(ResizableArray arr);
    boolean isEmpty();
    Object get(int index);
    Object[] toArray();
    boolean equals(Object o);
    int hashCode();
    String toString();
    



    
}
