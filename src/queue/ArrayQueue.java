public class ArrayQueue<E> implements Queue<E>  {

    Object [] arr;
    int ct=0;
    int cap=Queue.initialCap;

    public ArrayQueue() {

        arr=new Object[cap];
    }

    public ArrayQueue( int cap){
       if(cap>=0){
         this.cap=cap;
         arr=new Object[cap];
       }
       else{
            throw new WrongInitialCapacity("Array capacity can not negative");
       }

    }
    public ArrayQueue(Queue<E> ref){

    }
    public boolean add(E ele){
       if(ele!=null){
          if(ct<arr.length*0.75){
           arr[ct]=ele;
          ct++;
           return true;
         }
         else{
           Object[] temp=new Object[arr.length*2];
           for(int i=0;i<ct;i++){
             temp[i]=arr[i];
             }
             arr=temp;
            arr[ct]=ele;
           ct++;
           return true;
        }
       }
       else{
         return false;
       }
       
    }
    

    public E element(){
    
         if(arr[0]!=null){
            return (E)arr[0];
         }
      return  null ;
    }


    public boolean  offer(E ele){
      return add(ele);
    }
    public E peek(){
      return element();
    }

    public E remove()
    {
      E val=(E)arr[0];
      if(val!=null){
         for(int i=0;i<ct;i++){
           arr[i]=arr[i+1];
         }
         ct--;
         return val;
      }
      return null;
    }


    public E poll(){
      return remove();
    }

    public boolean isEmpty(){
      return ct==0;
    }


    public int size(){
      return ct;
    }

    public boolean  equals(Object o){
      ArrayQueue<E> ref= (ArrayQueue<E>)o;
      for(int i=0;i<ct;i++){
        if(this.arr[i]!=ref.arr[i]){
          return false;
        }
      }
      return true;

    }

    public String toString(){
      String ans="[";
      for(int i=0;i<ct;i++){
        if(i<ct-1){
          ans+=arr[i]+", ";
        }
        else{
          ans+=arr[i]+"]";
        }
      }
      return ans;
    }


    public boolean  contains(E ref){
      for(int i=0;i<ct;i++){
        if(ref.equals(arr[i])){
          return true;
        }
      }
      return false;
    }

    public boolean makeNextHead(E ele){
      if(ele!=null){
        int index=indexOf(ele);
        if(index==1){
          return true;
        }
        else{
          int i=index==-1? ct: index;
          for(;i>1;i--){
            arr[i]=arr[i-1];

          }
          arr[i]=ele;
          ct=index==-1? ct++:ct;
          return true;
        }
      }
      return false;
    }

    public  void shuffle(){
      for(int i=ct-1;i>0;){
        int j=(int)Math.random()*(i+1);
        if(j!=0){
          Object temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i--;
        }

      }
    }

    private int indexOf(E ele){
      for(int i=0;i<ct;i++){
        if(ele.equals(arr[i])){
          return i;
        }
      }
      return -1;
    }




    
}
