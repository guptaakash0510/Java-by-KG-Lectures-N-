import java.util.Scanner;

class Loop_L_14 {
     public static void main(String[] args) {
        /* int num=1; // initialization
         while(num<=10){  // condition
             System.out.println(num); // actual work
             num=num+1; // updating the condition
         } */

      /*   int count = 500;
         while(count >=200){
             System.out.println(count);
             count -= count;
         } */

         Scanner input = new Scanner(System.in);
         int num = 1;
         while(num <=5){
             int a=input.nextInt();
             System.out.println("The number is: "+a);
             num++;
         }
     }
}
