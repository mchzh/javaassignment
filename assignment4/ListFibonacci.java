/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/16
 *
 *generate Fibonacci number
 *  - For eg: - Input : 145 (Maximum number upto which you need to generate the Fibonacci numbers)
 *	- Output : 1,1,2,3,5,8,13,21,44,55,89,144   			
*/
import java.util.Scanner;

public class ListFibonacci {
	private static Scanner scan;
	
	public static void main(String[] args) {  
		  scan = new Scanner(System.in);
		  System.out.print("Input a  number £º");  


		  try {  
			  int number = new Scanner(System.in).nextInt();
			  fibonacciLoop(number);
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}  

	public static void fibonacciLoop(int number) {  
        int fibo1=1, fibo2=1, fibonacci=1;
        System.out.print("Output : ");
        System.out.print(fibo1+" "+fibo2+" ");
        while(fibonacci <= number && (fibo1 + fibo2) <= number){
        	fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci+" ");
        }
	}  
}
