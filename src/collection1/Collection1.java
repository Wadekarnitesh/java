package collection1;

public interface Collection1<E> {
    int initialCap=10;
    double loadFactor=0.75;
    boolean add(E o);
    boolean remove(E o);
    int size();
    boolean contains(E o);
    boolean isEmpty();
    Object get(int index);
    Object[] toArray();
    boolean equals(Object o);
    int hashCode();
    String toString();
    


    
}
