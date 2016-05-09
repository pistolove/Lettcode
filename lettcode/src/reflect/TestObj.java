package reflect;

public class TestObj {

    
    public static void main(String[] args) {
        int[] a = new int[]{1,2,33};
        int[] b = a;
        a=null;
        System.err.println(b);
        
        
        
    }
}
