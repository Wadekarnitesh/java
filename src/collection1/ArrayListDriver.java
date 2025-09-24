package collection1;

public class ArrayListDriver {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(100);
        a1.add(3);
        a2.addAll((ResizableArray<Integer>) a1);
        System.out.println(a2);
        
        
    }
    
}
