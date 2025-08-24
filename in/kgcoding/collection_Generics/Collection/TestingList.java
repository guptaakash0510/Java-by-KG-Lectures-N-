package in.kgcoding.collection_Generics.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
     //   List strList = new ArrayList(); // it is also a important line as it is.
        List<String> strList = new ArrayList<>();
       //  List<Integer> strList = new ArrayList<>(); // it is also important, here wrapper class is used.
        strList.add("Akash");
        strList.add("Gupta");

        strList.add(1,"kumar");
        strList.remove(0);

        if (strList.contains("Gupta")) {
           // System.out.println("Gupta exists"); // it is also a important line.
            System.out.println(strList.indexOf("Gupta"));
        }

       // System.out.println(strList.get(0));
        for(int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

        for (String str : strList) {
            System.out.println(str);
        }
    }
}
