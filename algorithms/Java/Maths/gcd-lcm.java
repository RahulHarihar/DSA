/** Author : [Rahul Harihar]
 * Github : [https://github.com/RahulHarihar]
 */

/** PROBLEM DESCRIPTION :
 * Given two integers, find their Greatest Common Divisor (GCD) and Least Common Multiple (LCM).
 * The GCD is the largest number that divides both integers without leaving a remainder.
 * The LCM is the smallest positive integer that is divisible by both integers.
 */

/** ALGORITHM :
 * Step 1 : START
 * Step 2 : Declare two methods - one to calculate GCD using the Euclidean algorithm, and another to calculate LCM using the formula:
 *          LCM(a, b) = (a * b) / GCD(a, b)
 * Step 3 : In the GCD method, use recursion:
 *          (a) If b == 0, return a (base case).
 *          (b) Otherwise, call the method recursively with parameters (b, a % b).
 * Step 4 : In the LCM method, calculate the product of the two numbers and divide by their GCD.
 * Step 5 : In the main method, take user input for two numbers, and print their GCD and LCM using the appropriate methods.
 * Step 6 : STOP
 */

 import java.util.Scanner;

 public class GcdLcmCalculator {
 
     // Method to calculate GCD using recursion
     public static int findGCD(int a, int b) {
         if (b == 0) {
             return a;
         }
         return findGCD(b, a % b);
     }
 
     // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
     public static int findLCM(int a, int b) {
         return (a * b) / findGCD(a, b);
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Taking input from the user
         System.out.print("Enter the first number: ");
         int num1 = scanner.nextInt();
         System.out.print("Enter the second number: ");
         int num2 = scanner.nextInt();
 
         // Calculating GCD and LCM
         int gcd = findGCD(num1, num2);
         int lcm = findLCM(num1, num2);
 
         // Displaying the results
         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
         System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
 
         scanner.close();
     }
 }
 
 /** OUTPUT :
  * Example 1:
  * Enter the first number: 15
  * Enter the second number: 20
  * GCD of 15 and 20 is: 5
  * LCM of 15 and 20 is: 60
  * 
  * Example 2:
  * Enter the first number: 8
  * Enter the second number: 12
  * GCD of 8 and 12 is: 4
  * LCM of 8 and 12 is: 24
  */
 
 /** Time Complexity : O(log(min(a, b))) for GCD calculation, O(1) for LCM
  * Auxiliary Space Complexity : O(1)
  */
 