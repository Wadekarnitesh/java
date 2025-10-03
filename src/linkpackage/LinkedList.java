package linkpackage;

public class LinkedList<E> implements Collection<E>{

    Node<E> head;
    Node<E> tail;
    
    int count;

    public LinkedList() {
    }
    @ Override
    public boolean add( E o)
    {
        if(count==0)
        {
            head=new Node<E>(o,null,null);
            tail=head;
            count++;
            return  true;

        }
        else{
            Node<E> temp=new Node<E>(o, tail, null);
            this.tail.next=temp;
            this.tail=temp;
            count++;
            return true;
        }
    }
    @ Override
    public  boolean  addAll(Collection<E> c)
    {
        if(c!=null && c instanceof LinkedList)
        {
            LinkedList<E> list2= (LinkedList<E>)c;
            Iterator<E> head =list2.iterate();
            while(head.hasNext())
            {
                add(head.next());
            }
            return true;

        }
        return  false;
    }
    @ Override
    public boolean  isEmpty()
    {
        return size()==0;
    }
    @ Override
    public int size()
    {
        return count;
    }
    @ Override
    public Iterator<E> iterate()
    {
        Iterator<E> ref=new Iterator<E>(head,this,0);
        return ref;
    }
    @ Override
    public Iterator<E> reverseIterate()
    {
        Iterator<E> ref=new Iterator<>(tail, this, this.size()-1);
        return ref;
    }

    public boolean removeLast()
    {
        if(tail!=null){
            tail=tail.prev;
            tail.next=null;
            count--;
            return true;
        }
        return false;
    }
  
    public boolean removeFirst()
    {
        if(size()==1){
            clear();
        }
        else if(size()>1&& head!=null)
        {
            head=head.next;
            head.prev=null;
            count--;
            return true;
        }
        return false;
    }

    @ Override
    public void clear()
    {
        head=null;
        tail=null;
        count=0;
    }
    @ Override
    public boolean contains(E ele)
    {
        Iterator<E> ref= iterate();
        while (ref.hasNext()){
            E val=ref.next();
            if(val.equals(ele)){
                return true;
            }
        }
        return false;
    }

    @ Override
    public boolean remove(E ele){
        Iterator<E> head=iterate();
        while (head.hasNext()) {
            E val=head.next();
            if(val.equals(ele)){
                if(head.ct==1){
                    removeFirst();
                }
                else if(head.ct==size()){
                    removeLast();
                }
                else{
                    head.preRef.prev.next=head.currRef;
                    head.currRef.prev=head.preRef.prev;
                    count--;
                }
                return true;
            } 
            
        }
        return false;

    }

    @ Override
    public boolean removeAll(Collection<E>  c)
    {
        if(c!=null && c instanceof LinkedList){
            LinkedList<E> list2=(LinkedList<E>)c;
            Iterator<E> head=list2.iterate();
            while (head.hasNext()) {
                E val =head.next();
                while (contains(val))
                 {
                    remove(val);
                    
                }
                
            }
              return true;

        }
        return false;
    }

    @ Override
    public boolean  retainAll(Collection<E> c)
    {
        if(c!=null && c instanceof LinkedList){
            LinkedList<E> temp=new LinkedList<E>();
            LinkedList<E> list2= (LinkedList<E>)c;
            Iterator<E> ref=iterate();
            while(ref.hasNext()){
                E ele=ref.next();
                if(list2.contains(ele)){
                    temp.add(ele);
                }
            }

            if(temp.size()!=0){
                head=temp.head;
                tail=temp.tail;
                count=temp.count;
                return true;
            }
            return false;
        }
        return false;
    }

    @ Override
    public boolean containsAll(Collection<E> c){
        if(c!=null && c instanceof LinkedList){
               LinkedList<E> list2= (LinkedList<E>)c;
            Iterator<E> head=iterate();
            while (head.hasNext()) {
                if(!contains(head.next())){
                    return false;
                }
                
            }
            return true;
        }
        return false;
    }

    @ Override
    public String toString()
    {
        String s="[";
        Iterator<E> ref=iterate();
        while(ref.hasNext()){
            s+=ref.next()+" ";
        }
        s+="]";
        return s;
    }
    @ Override
    public boolean equals(Object o){
        LinkedList<E> l=(LinkedList)o;
        if(o!=null&& this.size()==l.size()){
            Iterator<E> ref=iterate();
            Iterator<E> ref2=l.iterate();
            while (ref.hasNext()) {
                if(!(ref.next().equals(ref2.next()))){
                    return false;
                }
            }
            return  true;
        }
        return false;
    }
    @ Override
    public Object[] toArray()
    {
        Object[] arr= new Object[size()];
        int i=0;
        Iterator<E> itr=iterate();
        while (itr.hasNext()) {
            arr[i++]=itr.next(); 
            
        }
        return arr;
    }
    
    
}
