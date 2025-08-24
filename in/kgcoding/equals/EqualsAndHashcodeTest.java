package in.kgcoding.equals;

public class EqualsAndHashcodeTest {

    public static void main(String[] args) {
        Person person1 = new Person("Akash",28,"001");
        Person person2 = new Person("Akash",28,"001");

        if (person1 == person2) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equal");
        }

        if (person1.equals(person2)) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
