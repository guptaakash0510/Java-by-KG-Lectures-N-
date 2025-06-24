package ForEachLoop;

public class forEachLoop {
    public static void main(String[] args) {
        String[] array = {"Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta"};
        //printArray(array);
        printArrayForEach(array);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

      /*  for (String name : array) {
            System.out.println(name);
        } */
    }


    public static void printArrayForEach(String[] array){
        for(String name: array){
            System.out.println(name);
        }
    }


}