import java.util.Scanner; 

//find the maximum and minimum number in an array of numbers
public class SendoutMaxandMin {

private static Scanner scan;

public static void main(String[] args) {  

scan = new Scanner(System.in);

System.out.print("Input a  String £º");  


try {  
	  String str = scan.nextLine();// get the imput info 
	  fMaxMIn(str);
//	  String str1= str.replaceAll(" ", "");
//	  String[] arr=str1.split(",");
//	  System.out.println(arr.length+"\t"+arr[0]+"\t"+arr[1]); 
//	  str1 = arr[1].replaceAll("'", "");
//	  int sum = nSincludech(arr[0],str1);
//	  if(sum == 0)
//		  System.out.println(arr[0] + " has " + " no " + arr[1]);// output number get from nDigit() method
//	  else
//		  System.out.println(arr[0] + " has " + sum + " " + arr[1]);// output number get from nDigit() method
	  //System.out.println("Input str is : " + str);// output number get from nDigit() method
	  //System.out.println(str1);
	  //System.out.println(arr.length+"\t"+arr[0]+"\t"+arr[1]); 
} catch (Exception e) {  
System.out.println("please input a string");// catch exception£¬if input number not int£¬ouput exception  
}  
}  

/** 
* <pre> 
* find the maximum and minimum number in an array of numbers
* </pre> 
*  
* @param s
*            input value 
* @return max value
*/  
public static void fMaxMIn(String s) {  
int count=0; // initial 
int max;
int min;

String str1= s.replaceAll("\\[","");
str1= str1.replaceAll("\\]","");
str1= str1.replaceAll(" ","");
String[] arr=str1.split(",");
count=arr.length;
int[] aValue=new int[count];
for(int i=0;i< count;i++)
{
	 aValue[i]=Integer.valueOf(arr[i]).intValue();
}
max=aValue[0];
min=aValue[0];
for(int j=0;j< count;j++)
{
	 if(max < aValue[j])
		 max=aValue[j];
	 if(min > aValue[j])
		 min=aValue[j];
}
System.out.println("Output : " + "Max is " + max + " and Min is " + min); 
}  
}  