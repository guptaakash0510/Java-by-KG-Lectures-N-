import java.util.Scanner;

class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial generator\n");
        System.out.println("please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        //long fact = factorial_iterative(num);
        System.out.println("Factorial of your number is: " + fact);
    }

    public static long factorial(int num) {
        System.out.println("function called for: " + num);
        long fact1;
        if (num == 1) {
            return 1;
        }
        else
            fact1 = num * factorial(num - 1);
        return fact1;
    }

    public static long factorial_iterative(int num) {
        long result =1;
        for (int i = 1; i <= num; i++){
            result = result * i;
        }
        return result;
    }
}