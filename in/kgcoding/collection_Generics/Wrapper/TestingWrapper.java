package in.kgcoding.collection_Generics.Wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
       // Integer first = new Integer(55); // wrong
      //  Integer first = Integer.valueOf("55"); // Also a way to declair.
        Integer first = 55; // Autoboxing
        System.out.println(first);
        int second = first; // Unboxing
    }
}
