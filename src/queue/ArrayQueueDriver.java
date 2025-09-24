


public class ArrayQueueDriver {

    public static void main(String[] args) {
        ArrayQueue<Integer> q1=new ArrayQueue<Integer>();

        q1.add(12);
        q1.add(13);
        q1.add(14);
        q1.add(15);
        q1.add(80);


        // System.out.println(q1);
        ArrayQueue<Integer> q=new ArrayQueue<Integer>();

        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(80);
        System.out.println(q1.size());
        System.out.println(q);
        System.out.println(q1.equals(q));
    }
    
}
