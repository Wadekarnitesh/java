package collection;

public class ArrayList<E> implements ResizableArray<E>{
    Object[] arr;
    int count = 0;
    int initialCap = ResizableArray.initialCap;

    public ArrayList() {
        arr = new Object[initialCap];
    }

    public ArrayList(int initialCap) {
        this.initialCap = initialCap;
        arr = new Object[initialCap];
    }

    public boolean add(E o) {
        if (count < arr.length * ResizableArray.loadFactor) {
            arr[count] = o;
            count++;
        } else {
            Object[] temp = new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            arr[count] = o;
            count++;
        }
        return true;
    }

    public boolean add(int index, E o) {
        if (index <= count) {
            if (count + 1 < arr.length * ResizableArray.loadFactor) {
                rightShift(index);
                arr[index] = o;
                count++;
                return true;
            } else {
                Object[] temp = new Object[arr.length + 1];
                for (int i = 0; i < count + 1; i++) {
                    if (i < index) {
                        temp[i] = arr[i];
                    } else if (i == index) {
                        temp[i] = o;
                    } else {
                        temp[i] = arr[i - 1];
                    }
                }
                arr = temp;
                count++;
                return true;
            }
        }
        throw new ArrayIndexOutOfBoundsException("cannot insert element at index");
    }

    private void rightShift(int index) {
        for (int i = count; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public boolean remove(E o) {
        int index = indexOf(o);
        if (index != -1) {
            leftShift(index);
            count--;
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index < count) {
            leftShift(index);
            count--;
            return true;
        }
        return false;
    }

    public void leftShift(int index) {
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < count; i++) {
            if (arr[i] != null && arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String op = "[";
        for (int i = 0; i < count; i++) {
            if (i < count - 1) {
                op += arr[i] + ", ";
            } else {
                op += arr[i];
            }
        }
        return op + "]";
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public  void clear(){
        for(int i=0;i<count;i++){
            arr[i]=null;
        }
        count=0;
    }
    public  boolean isEmpty(){
        return count==0;
    }
    public  boolean equals(Object o){
        if(o==null)
        {
            return false;
        }
        else if(o.getClass()!=this.getClass())
        {
            return  false;
        }
        else if(this==o){
            return  true;
        }else{
            ArrayList<E> a= (ArrayList<E>)o;
            if(this.count==a.count){
                for(int i=0;i<count;i++)
                {
                    if(!this.arr[i].equals(a.arr[i])){
                        return  false;
                    }
                }
                return  true;
            }
            return  false;
        }
    }
    public E get(int index) {
        if (index >= 0 && index < count) {
            return (E) arr[index];
        }
      throw new IndexOutOfBoundsException("cannot find the element out of range");
    }

    public Object[] toArray(){
        Object[]ans=new Object[count];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i];

        }
        return ans;
    }

    public boolean addAll(ResizableArray<E> ref){
        ArrayList<E> a1=(ArrayList<E>)ref;
        for(int i=0;i<a1.count;i++){
            this.add((E)a1.get(i));
        }
        return true;
    }
    public boolean addAll(int index,ResizableArray arr){
          if(index>=0 &&index<count && arr!=null&& (count!=0)){
            ArrayList<E> list=(ArrayList<E>) arr;
            for(int i=0;i<list.size();i++){
                this.add(index,list.get(i));
                index++;
            }
            return true;

        }
        return false;


    }

    public int size()
    {
        return count;
    }

   public boolean removeAll( ResizableArray<E> o){
        return true;
   }
   public boolean containsAll(ResizableArray<E> o){
    return true;
   }

   public void retailAll( ResizableArray<E> o){

     System.out.println();
   }
    
}
