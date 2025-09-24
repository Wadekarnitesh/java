package collection1;

public class Stack<E> {
    ArrayList<E> list=new ArrayList<E>();
    public Stack(){

    }
    public boolean push(E e){
        return list.add(e);
    }

    public E pop(){
        E ele=list.get(list.size()-1);
        list.remove(list.size()-1);
        return ele;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int contains(E e){
        int index=list.indexOf(e);
        if(index==-1){
            return index;
        }
        return list.size()-index;
    }
    

    public E peek(){
        return list.get(list.size()-1);
    }

    public int size()
    {
        return list.size();
    }

}
