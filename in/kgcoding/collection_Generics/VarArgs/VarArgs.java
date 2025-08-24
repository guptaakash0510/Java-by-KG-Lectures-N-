package in.kgcoding.collection_Generics.VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(2,8,5,4,7,2));
    }

    public static int sum(int first, int second, int... a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

   /* public static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    } */

    public static int sum(int a, int b) {
        return a + b;
    }
}
