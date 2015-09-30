import java.util.Scanner; 

//take a String and character as input and find how many characters are in the String
public class HasCharNum {

private static Scanner scan;

public static void main(String[] args) {  

scan = new Scanner(System.in);

System.out.print("Input a  String £º");  


try {  
	  String str = scan.nextLine();// get the imput info 
	  String str1= str.replaceAll(" ", "");
	  String[] arr=str1.split(",");
	  System.out.println(arr.length+"\t"+arr[0]+"\t"+arr[1]); 
	  str1 = arr[1].replaceAll("'", "");
	  int sum = nSincludech(arr[0],str1);
	  if(sum == 0)
		  System.out.println(arr[0] + " has " + " no " + arr[1]);// output number get from nDigit() method
	  else
		  System.out.println(arr[0] + " has " + sum + " " + arr[1]);// output number get from nDigit() method
	  //System.out.println("Input str is : " + str);// output number get from nDigit() method
	  //System.out.println(str1);
	  //System.out.println(arr.length+"\t"+arr[0]+"\t"+arr[1]); 
} catch (Exception e) {  
    System.out.println("please input a string");// catch exception£¬if input number not int£¬ouput exception  
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
public static int nSincludech(String s,String sub) {  
   int count=0; // initial 
   char ch=sub.toCharArray()[0];

  if(sub.length() != 1 || sub.isEmpty())
	  System.out.println("the second must be character");// catch exception£¬if input number not int£¬ouput exception
  if(s.isEmpty())
	  return count;
  if(s.contains(sub))
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