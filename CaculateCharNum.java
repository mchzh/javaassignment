import java.util.Scanner; 

//find how many 'a' characters are in a String
public class CaculateCharNum {

private static Scanner scan;

public static void main(String[] args) {  

  scan = new Scanner(System.in);

  System.out.print("Input a  String £º");  


  try {  
	  String str = scan.nextLine();// get the imput info 
	  int sum = nSincludea(str,'a');
	  if(sum == 0)
		  System.out.println(str + " has " + " no 'a'£¡");// output number get from nDigit() method
	  else
		  System.out.println(str + " has " + sum + " 'a'£¡");// output number get from nDigit() method
  } catch (Exception e) {  
      System.out.println("please input a int");// catch exception£¬if input number not int£¬ouput exception  
  }  
}  

/** 
* <pre> 
* find how many assigned ch characters are in a String
* </pre> 
*  
* @param s,ch 
*            input value 
* @return 'a' char number 
*/  
public static int nSincludea(String s,char ch) {  
   int count=0; // initial 

  if(s.isEmpty())
	  return count;
  if(s.contains(String.valueOf(ch)))
  {
	  for(int i = 0; i < s.length(); i++){
		   if(s.charAt(i)==ch){
		    count++;
		   }
	  }
  }else{
	  count=0;
  }
  return count;
}  
}  