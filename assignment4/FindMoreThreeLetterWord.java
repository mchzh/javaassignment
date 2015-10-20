/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/15
 *
 *print the words that have more than 3 letters in a sentence
 *Input : Java is a cool OOP. It doesnt have multiple inheritance.
 *	Output:
			Java
			cool
			doesnt
			have
			multiple
			inheritance
 */
import java.util.Scanner;

//capitalize every first letter of a word in the sentence 
public class FindMoreThreeLetterWord {
	private static Scanner scan;
	
	public static void main(String[] args) {  
		  scan = new Scanner(System.in);
		  System.out.print("Input a  string £º");  


		  try {  
			  String str = scan.nextLine();// get the imput info
			  //morethanthreeletter(str);
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}  
	
	//print the words that have more than 3 letters in a sentence
	public boolean morethanthreeletter(String sCheck) {
		int total=sCheck.length();
		int x=0;
		int begin=0;
		int end=0;
		char ch;
		String sResult="";
		int chcount=1;
		while(x < total){
			ch=sCheck.charAt(x);
			if(ch != ' ' && ch != '.' && ch != ','){
				if(x==total-1){
					end=x;
					if((end-begin+1) > 3){
						sResult=sCheck.substring(begin,end+1);
						System.out.println(sResult);
					}
					return true;
				}else{
					x++;
				}
			}else{
				if(x==total-1){
					end=x-1;
					if((end-begin+1) > 3){
						sResult=sCheck.substring(begin,end+1);
						System.out.println(sResult);
					}
					return true;
				}else{
					if(sCheck.charAt(x+1)==' ' || sCheck.charAt(x+1)=='.'
							||sCheck.charAt(x+1)==','){
						chcount++;
						x++;
					}else{
						end=x-chcount;
						chcount=1;
						if((end-begin+1) > 3){
							sResult=sCheck.substring(begin,end+1);
							System.out.println(sResult);
						}
						x++;
						begin=x;	
					}
				}
			}
		}
		return true;
	}  
}


