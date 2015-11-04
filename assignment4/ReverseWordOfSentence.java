/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/16
 *
 *reverse the words in a sentence 
 * Input : I love the object oriented program course in NEU
 * Output : NEU in course program oriented object the love I
*/
import java.util.Scanner;

public class ReverseWordOfSentence {
	private static Scanner scan;
	private String sOut;
	
	public String getsOut() {
		return sOut;
	}

	public void setsOut(String sOut) {
		this.sOut = sOut;
	}

	public static void main(String[] args) { 
		  scan = new Scanner(System.in);
		  // please not put such strange characters in your comments. 
		  System.out.print("Input a  string £º");  


		  try {  
			  String str = scan.nextLine();// get the imput info 
			  //reversewordofsentence(str);
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}	
	
	public void reversewordofsentence(String sSentence) {
	  String sWord="";
	  int i=0;
	  int len=sSentence.length();
      
      while(i < len)
      {
    	  if(sSentence.charAt(i)!= ' ')
    	  {
    		  sWord=sWord+sSentence.charAt(i);
    		  i++;
    		  if(i==len)
    			  sOut = sWord+sOut;
    	  }else{
    		  sOut = " " + sWord+sOut;
    		  i++;
    		  sWord="";
    	  }
      }
      System.out.println("reverse sentence is ->"+sOut);
	}  
	
	private static void twoexpoent() {
		int k=5;
		for (int i = 0; i < k; i++) {
		    System.out.print((1 << i) + " ");
		}//print "1 2 4 8 16" method
		for (int j = 0; j < k+1; j++) {
		    System.out.print(((1 << k) >> j) + " ");
		}
		int number=20;
		int total=0;
		int x=1;
		for(int i=0;i<number;i++){
			total+=x;
			x++;
		}
		System.out.print("total equals -> " + total);
	}  
}

