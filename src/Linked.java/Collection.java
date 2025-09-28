public interface Collection<E>
{
    boolean add(E o);
    boolean addAll(Collection<E> arr);
    boolean remove(E o);
    boolean removeAll(Collection<E> arr);
    void clear();
    boolean retainAll(Collection<E> arr);
    int size();
    boolean contains(E o);
    boolean containsAll(Collection<E> arr);
    boolean isEmpty();
    Object[] toArray();
    boolean equals(Object o);
    int hashCode( );
    String toString();


}