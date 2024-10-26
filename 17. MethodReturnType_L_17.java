import java.util.Scanner;

class MethodReturnType_L_17 {
     public static void main(String[] args) {
         greet();
         int first = readNumber() + 1;
         int second = readNumber() + 2;

         int result = first + second;
         System.out.println("The result is: "+result);
     }

     public static int readNumber(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int number=input.nextInt();
         return number;
     }

     public static void greet(){
         System.out.println("Welcome to the Calculator");
     }
}
