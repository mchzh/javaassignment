/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/16
 *
 *in console output pyramid number£º
 *       1
 *      2 3
 *     4 5 6
 *    7 8 9 10
*/
import java.util.Scanner;

//print a pyramid of numbers
public class PyramidLine {
	private static Scanner scan;
	
	public static void main(String[] args) {  
		  scan = new Scanner(System.in);
		  System.out.print("Input a  number £º");  


		  try {  
			  //int number = new Scanner(System.in).nextInt();
			  int sum = scan.nextInt();
			  //str.split(",");
			  //reversewordofsentence(str);
			  makepyramidline(sum);
		  } catch (Exception e) {
		  		// why do you think all exceptions you meet is ArrayIndexOutOfBoundException?
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}  
	
	public static void makepyramidline(int cascade) {
		int total=0;
		int x=1;
		int count=0;
		for(int i=0;i<cascade;i++){
			total+=x;
			x++;
		}
	    int[] numbers= new int[total];
	    int columnsPerNumber = String.valueOf(total).length();

	    System.out.println("Output a pyramid : ");
	    for(int k=0;k<cascade;k++){
	    	for(int l=0;l<cascade-k-1;l++){
	    		printSpace(columnsPerNumber);
	    	}
	    	for(int m=0;m<k+1;m++){
	    		count++;
	    		System.out.printf("%"+columnsPerNumber+"d", count);
	    		printSpace(columnsPerNumber);
	    	}
	    	//System.out.printf("%"+columnsPerNumber+"d", total);
	    	System.out.println("");
	    }
	}  
	
	//output the amount of num " "
	public static void printSpace(int num) {
        for (int s = 0; s < num; s++) {
            System.out.print(" ");
        }
    }
}

//python similar code
//def pyramid(num):
//  for i in range(num):
//      print '\0\0'*(num-i),
//      for j in range(i):
//          print 1<<j,
//      for k in range(i+1):
//          print (1<<i) >> k,
//      print

