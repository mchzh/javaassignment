//Math deal with even
//Funtion: display even numbers from 2 to the number passed as input
//Author:
//Date:
//Cooporation:
import java.util.Scanner; 
public class EvenFromtwo {
	
	public static void main(String[] args) {  

	      Scanner scan = new Scanner(System.in);// scanner£¬receive the input info of control station  

	      System.out.print("Input a int number £º");  

	      try {  
	          int num = scan.nextInt();// get the imput info
	          TwotoNumberforEven(num);
	      } catch (Exception e) {  
	          System.out.println("please input a int");// catch exception£¬if input number not int£¬ouput exception  
	      }  
	}
	

/** 
 * <pre> 
 * display even numbers from 2 to the number passed as input
 * </pre> 
 *  
 * @param eNumber 
 *            input value 
 * @return  
 */  
public static void TwotoNumberforEven(int eNumber){
	int eIncrement = 0;
	if(eNumber > 0)
	{
		if(eNumber%2 == 0) //judge whether even
		{
			String str=""; 
			for(int i=0; i< eNumber/2; i++)
			{
				eIncrement +=2;
				str = str + eIncrement +", "; //put all output into str
			}
			System.out.println("Output : " +  str);
		}
	}else{
		System.out.println(eNumber + " -> is not divide by 2!");
		return;
	}		
}
}