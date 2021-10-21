// Name: Susan Uland
// CS 141
// Core Topics: Creating a java 
// program with static methods, constants and for loops
//
// This program will call a series 
// of static methods which will
// demo for loops, constants, and nested for loops

public class Loops {

   // Declare an integer constant to hold the number 5,786 named NUM
   public static final int NUM = 5786;


   //Declare an integer constant to hold the number 5 named MAX
   
   
      
   public static void main(String[] args) {
       
       // fix this method
       Loops.infinite();
       System.out.println();
       
       // complete this method
       //Loops.forLoop();      
       System.out.println();
       
      
       // complete this method      
       //Loops.rootbeer();
       System.out.println();
       
       // fix this method
       //Loops.printDigits();
       System.out.println();
       
       // complete this method
       //Loops.nestedLoop();
       
       
       
   }
   
   // this method  contains an infinite loop which needs to be fixed
    public static void infinite() {
       // fix me
       for (int i = 1; i < 5; i++) {
          System.out.println(i);
       }
       
   
    }
   
   public static void forLoop() {
      // TASK: print count down loop
      // 5 4 3 2 1
      // pseudocode
      // for (each number >= 1) {
      //   print out the number
      //   subtract one from the number
       
      // }


       
      System.out.println();  
             
      
      //TASK: print numbers using loop
      // 2 4 8 16 32 64
      // pseudocode:
      // for (each number < 65) {
      //   print out the number
      //   multiply the number by 2 
      // }

      
      System.out.println();
      
      //TODO: TASK: print numbers using loop (You Try)
      // 7 15 23 31 39
      // pseudocode:
      // for (each number < 40) {
      //   print out the number
      //   add 8 to the number 
      // }     

      
      System.out.println();
      
      //TODO: TASK: print numbers using loop (You Try)
      // 27 9 3 1 
      // pseudocode:
      // for (each number >= 1) {
      //   print out the number
      //   divide the number by 3 until number is < 1
      // }   

                 

    }



   // TASK: Print the "rootbeer song" from 10 to 1
   // 10 bottles of rootbeer on the wall, 10 bottles of rootbeer
   //
   // Take one down, pass it around, 9 bottles of rootbeer on the wall
   // 9 bottles of rootbeer on the wall, 9 bottles of rootbeer
   // Take one down, pass it around, 8 bottles of rootbeer on the wall
   // 8 bottles of rootbeer on the wall, 8 bottles of rootbeer
   // Take one down, pass it around, 7 bottles of rootbeer on the wall
   // ...
  
   public static void rootbeer() {
      System.out.println("10 bottles of rootbeer on the wall, 10 bottles of rootbeer");
      
      // TODO: Add for loop here
      System.out.println("Take one down, pass it around, 9 bottles of rootbeer on the wall");
      System.out.println("9 bottles of rootbeer on the wall, 9 bottles of rootbeer");

      
   }


   // TASK: print the individual digits of NUM
    // pseudocode:
    // for each number > 0
    //   print the last digit of the number
    //   divide the number by 10 to make it smaller
    public static void printDigits() {   
   // NUM = 5678
      // set digit label to 1's place
      int digitLabel = 1;
      
      // for each number > 0
      for(int num = NUM; num > 0; num %= 10) {
          // isolate digit
          int digit = num % 10;
          
          // print out the digit with in place's label
          System.out.println(digitLabel + "'s place = " + digit);
          
          //update place label
          digitLabel = digitLabel * 10;
      }
 
           
   }


    public static void nestedLoop() {
      // Task: print 3 rows of 5 asterisks 
      // *****   row 1 
      // *****   row 2 
      // *****   row 3 
      //
      // pseudocode
      // for (each of the 3 rows) {
      //    for (each of the 5 columns) {
      //        print one * on the output line
      //    } 
      //}

 
      System.out.println();
      

      
      
      // Task: print 3 rows of row number 
      // 1   row 1 
      // 12  row 2 
      // 123 row 3 
      // pseudocode
      // for (each of the 3 rows) {
      //    for (each of the columns that are <= row number) {
      //        print the column number on the output line
      //    } 
      //}
      

      System.out.println();
      
      
   }

    
      
}
