package DoWhileLoop;

import java.util.Scanner;

class doWhileLoop {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
       /*  System.out.print("Please enter your age: ");
         int age = input.nextInt();
         while(age < 0 || age > 100){
             System.out.println("Your age is: " + age);
             age =input.nextInt();
         }
         System.out.println("Your age is: " + age); */
         int age;
         do{
             System.out.print("Please enter your age: ");
              age = input.nextInt();
         }while(age < 0 || age > 100);
         System.out.println("Your age is: " + age);
     }
}
