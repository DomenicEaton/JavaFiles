/*
MyCalculator.java
designed by Domenic Eaton

a simple calculator, accept two input (integer), and print out the sum
*/

import java.util.Scanner;

public class MyCalculator{
  // main method
  public static void main(String[] args){
    
    //
    System.out.println("Please enter three integers");
    // Scanner:
    Scanner sc = new Scanner(System.in);

    // get an integer
    int a = sc.nextInt();

    // get another integer
    int b = sc.nextInt();

    // get another interger
    int c = sc.nextInt();

    // add them together
    int s = a + b + c;

    //print out 
    System.out.println(a + " + " + b + " + " + c + " = " + s);
  }
}
