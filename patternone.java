/*
assignmentone.java
created by Domenic Eaton
simple loop pattern
*/

import java.util.Scanner;
  //Main method
public class patternone{
  public static void main(String[] args) {
    int row, i, j, space = 1;  
    System.out.print("Enter a number (for the assignment, enter 5): ");  
    Scanner sc = new Scanner(System.in);  
        row = sc.nextInt();  
          space = row - 1;  
            for (j = 1; j<= row; j++)  
          {  
            for (i = 1; i<= space; i++)  
          {  
          System.out.print(" ");  
          }  
          space--;  
            for (i = 1; i <= 2 * j - 1; i++)  
          {  
          System.out.print("*");  
          }  
          System.out.println("");  
          }  
          space = 1;  
            for (j = 1; j<= row - 1; j++)  
          {  
            for (i = 1; i<= space; i++)  
          {  
          System.out.print(" ");  
          }  
          space++;  
            for (i = 1; i<= 2 * (row - j) - 1; i++)  
          {  
          System.out.print("*");  
          }  
          System.out.println("");  
        }  
      }  
    }  