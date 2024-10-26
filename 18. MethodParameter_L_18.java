import java.util.Scanner;

class Methodparameter_L_18 {
     public static void main(String[] args) {
       /*  int num = sumtwonumber(8,6);
         System.out.println(num);*/
         System.out.println(sumtwonumber(8,6));
         System.out.println(sumtwonumber(4,2));
         System.out.println(sumtwonumber(3,7));

         Scanner input = new Scanner(System.in);
         System.out.print("Enter the value of two numbers: ");
         int first = input.nextInt();
         int second = input.nextInt();
         int total = sumtwonumber(first,second);
         System.out.println("The sum is: "+ total);
     }

     public static int sumtwonumber(int first,int second){
         System.out.println("First number received: "+first);
         System.out.println("Second number received: "+second);
         int sum = first + second;
         return sum;
     }
}
