 class LearnIf_L10 {
     public static void main(String[] args) {
         boolean isMale = false;// also try with false.
         String name = "Rahul";
         System.out.println("Before if");
         if (isMale) {
             System.out.println("Mr." + name);
         } else {
             System.out.println("Ms." + name);
         }
         System.out.println("After if");
         // Now the second part
         boolean isSeniorCitizen = false;
         boolean isAdult = false;
         if (isSeniorCitizen) {
             System.out.println("Hello Senior Citizen");
         } else {
             if (isAdult) {
                 System.out.println("Hello Adult");
             } else {
                 System.out.println("Hello child");
             }
         }
     }
 }
        /* if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }
        else if(isAdult){

                System.out.println("Hello Adult");
            }
        else{
                System.out.println("Hello child");
            }
    }
}*/
