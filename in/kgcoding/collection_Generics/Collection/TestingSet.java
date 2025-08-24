package in.kgcoding.collection_Generics.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Akash"));
        System.out.println(names.add("Bishal"));
        System.out.println(names.add("KG Coding"));
        Utility.print(names);

        System.out.println(names.add("Akash"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Akash"));
        System.out.println(names.remove("Akash"));
        Utility.print(names);

        System.out.println(names.remove("Akash"));
    }
}
