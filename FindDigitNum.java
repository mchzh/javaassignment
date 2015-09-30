import java.util.Scanner; 

//find how many digits does a number
public class FindDigitNum {

private static Scanner scan;

public static void main(String[] args) {  

    scan = new Scanner(System.in);

    System.out.print("Input a int number £º");  

    try {  
        int num = scan.nextInt();// get the imput info  
        System.out.println("Output : " + num + " has " + nDigit(num) + " digits£¡");// output number get from nDigit() method  
    } catch (Exception e) {  
        System.out.println("please input a int");// catch exception£¬if input number not int£¬ouput exception  
    }  
}  

/** 
 * <pre> 
 * find how many digits does a number
 * </pre> 
 *  
 * @param a 
 *            input value 
 * @return digits number 
 */  
public static int nDigit(int a) {  

    int dten=10; // multi 10 
    int count=1; // initial 1 digit

    while(a/dten > 0)
    {
    	count += 1;
    	dten = dten * 10;
    }
    return count;
}  
}  