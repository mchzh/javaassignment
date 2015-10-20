/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/14
 *
 *Playing a Game named Cows and Bulls
 * Computer will guess a number between 1000 and 9999. Let's say 5478
 *- Input : 1658	
 *- Output : 1 Cow 1 Bull 
 *- Continue the game till the user enters a number that has 0 Cow and 4 Bull
 */
import java.util.Scanner;
import java.util.Random;

public class DecideBullCow {
	private static Scanner scan;
	
	public static void main(String[] args) {  
		  bullcowgame();  
		}

	private static void bullcowgame() {
		scan = new Scanner(System.in); 
		  String sInitial="5478";
		  int nBull=0;
		  int nCow=0;

		  try {  
			  while(nCow !=0 || nBull !=4){
				String sCompare = println("Input -> ");
				  while(!isUnique(sCompare)){
					  sCompare = println("Input String include same char, please re-input : ");
				  }
				  nBull=0;
				  nCow=0;
				  for(int i=0;i< sInitial.length();i++){
					  for(int j=0;j<sCompare.length();j++){
						  char chleft=sInitial.charAt(i);
						  char chright=sCompare.charAt(j);
						  if(chleft==chright && i==j){
							  nBull +=1;
						  }else{
							  if(chleft==chright && i!=j){
								  nCow +=1;
							  }
						  }
					  }
				  }
				  System.out.println("Output : " +nCow+" Cow "+nBull+" Bull ");
			  }
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");
		  }
	}

	private static String println(String sInput) {
		 System.out.print(sInput);
		  int iguess = scan.nextInt();
		  String sGetre = Integer.toString(iguess);
		return sGetre;
	}  
	
	//whether a string have same character
	public static boolean isUnique(String s) {
		 
        final boolean[] a = new boolean[256];
 
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int v = (int) s.charAt(i);
            if (a[v])return false;
            a[v] = true;
        }
 
        return true;
 
    }
}


