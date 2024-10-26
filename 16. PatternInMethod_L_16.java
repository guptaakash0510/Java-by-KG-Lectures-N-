 class PatternInMethod_L_16 {
     public static void main(String[] args) {
         System.out.println("First pattern is: ");
          firstPattern();

         System.out.println("Second pattern is: ");
          secondPattern();

         System.out.println("Third pattern is: ");
          thirdPattern();
     }

     public static void firstPattern(){
       /*   System.out.println("* ");
          System.out.println("* * ");
          System.out.println("* * * ");
          System.out.println("* * * * ");
          System.out.println("* * * * * "); */

          int i = 1;
          while(i<=5){
              int j = 1;
              while(j<=i){
                  System.out.print("* ");
                  j++;
              }
              System.out.println();
              i++;
          }

     }
     public static void secondPattern() {
        /*   System.out.println("* * * * *");
           System.out.println("* * * * ");
           System.out.println("* * * ");
           System.out.println("* * ");
           System.out.println("* "); */

         int i = 5;
         while (i >= 1) {
             int j = 1;
             while (j <= i) {
                 System.out.print("* ");
                 j++;
             }
             System.out.println();
             i--;
         }
     }
      public static void thirdPattern(){
       /*    System.out.println("        *");
           System.out.println("      * *");
           System.out.println("    * * *");
           System.out.println("  * * * *");
           System.out.println("* * * * *");  */

          int i = 1;
          while(i <= 10){
              int j = 8;
              int k = 1;
              while(j >= i){
                  System.out.print(" ");
                  j--;
              }
              while(k <= i){
                  System.out.print("* ");
                  k=k+2;
              }
              System.out.println();
              i = i+2;
          }
      }
}


