import java.util.Scanner;

class LogicalOparetor_L12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Portal");
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        System.out.print("Are you a Female (true/false): ");
        boolean isFemale = input.nextBoolean();
        if(age<5){
            System.out.println("You got 75% discount");
        }
        else if(isFemale){
            System.out.println("You got 50% discount");
        }
        else if(age>60 && !isFemale){ // important Line ( !isFemale)
            System.out.println("You got 25% discount");
        }
        else{
            System.out.println("You got no discount");
        }
    }
}
