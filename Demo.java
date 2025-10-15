class Demo {
     public static void main(String[] args) {
          float percentage = 34.32f;// when the first condition is satisfied then it stops checking for more
                                    // condition
          if (percentage >= 85 && percentage <= 100) {
               System.out.println("Distinction");
          } else if (percentage >= 60 && percentage <= 85) {
               System.out.println("First class");
          } else if (percentage >= 35 && percentage <= 60) {
               System.out.println("Second Class");
          } else if (percentage >= 0 && percentage <= 35) {
               System.out.println("Fail");
          } else {// returns all the invalid percent which are negavite or greater than zero
               System.out.println("Invalid");
          }

     }
}