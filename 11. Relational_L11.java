import java.util.Scanner;
 class Relational_L11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Lisence Portal");
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("You are Eligible for Driving");
        }
        else{
            System.out.println("Beta Cycle chalao");
        }
    }
}
