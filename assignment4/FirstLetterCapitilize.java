/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/15
 *
 *convertfirstletter()
 *capitalize every first letter of a word in the sentence
 *Input  : we love seattle and will live here for a long time.
 *Output : We Love Seattle And Will Live Here For A Long Time.
 */
import java.util.Scanner;

//capitalize every first letter of a word in the sentence 
public class FirstLetterCapitilize {
	private static Scanner scan;
	private static String sResult;
	
	public String getsResult() {
		return sResult;
	}

	public void setsResult(String sResult) {
		this.sResult = sResult;
	}

	public static void main(String[] args) {  
		  scan = new Scanner(System.in);
		  System.out.print("Input a  string £º");  


		  try {  
			  //int number = new Scanner(System.in).nextInt();
			  String str = scan.nextLine();// get the imput info
			  //convertfirstletter(str);
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}  
	
	public void convertfirstletter(String sSentence) {
		int total=sSentence.length();
		int x=0;
		int begin=0;
		int end=0;
		char ch;
		String sWord="";
		while(x < total){
			ch=sSentence.charAt(x);
			if(ch != ' ' && ch != '.'){
				x++;
			}else{
				end=x;
				sWord=Character.toUpperCase(sSentence.charAt(begin))+sSentence.substring(begin+1,end+1);
				System.out.print(sWord);
				sResult =sResult + sWord;
				if(sSentence.charAt(x) == '.'){
					break;
				}	
				else{
					x++;
					begin=x;	
				}
			}
		}
	}  
}


