/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/15
 *
 *Computer will guess a number between 1 and 100. We should find that number in less than 5 chances.
	Computer will ask the person playing the game to guess the number. Computer will respond if the guessed number is greater or less than or equal to what computer has guessed..
 * Let's say Computer has guessed 67 (Person playing the Game will not know this)
	>>Please guess a number between 1 and 100 - You have 5 chances to guess
	>>32
	>>32 is less than what I've guessed - You have 4 chances to guess
	>>75
	>>75 is greater than what I've guessed - You have 3 chances to guess
	>>50
	>>50 is less than what I've guessed - You have 2 chances to guess
	>>67
	>>Congratulations! You've guessed it right and you guessed it in 3 chances..
 */
import java.util.Scanner;
import java.util.Random;

//capitalize every first letter of a word in the sentence 
public class FiveChanceGuess {
	private static Scanner scan;
	
	public static void main(String[] args) {  
		  scan = new Scanner(System.in); 

		  try {  
			  Random randomGenerator = new Random();
			  int i = randomGenerator.nextInt(100);
			  System.out.println("Generator Random £º"+i); 
			  System.out.println(">>Please guess a number between 1 and 100 - You have 5 chances to guess"); 
			  for(int k=0;k<5;k++){
				  System.out.print(">>");
				  int j = scan.nextInt();
				  if(j<i)
					  System.out.println(">>"+j+" is less than what I've guessed - You have "+(5-k-1)+" chances to guess");
				  else
					if(j>i)
						System.out.println(">>"+j+" is greater than what I've guessed - You have "+(5-k-1)+" chances to guess");
					else
						if(j==i){
							System.out.println(">>Congratulations! You've guessed it right and you guessed it in "+(k+1)+" chances..");
							break;
						}
			  }
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}  
}


