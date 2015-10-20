package zero;

/*Java 
 *Author: Changzheng at neu.edu
 *License: GPLv2+
 *Time: 2015/10/16
 *
 *find the groups of two or more zeros (00 or 000 or 0000 etc)  in a one dimensional array that has either 1 or 
 * - input : int array[] = {1, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 }
 * - Output:
		00 occurs @ index 1
		0000000 occurs @ index 7
		00 occurs @ index 14
*/
import java.util.Scanner; 

public class ZeroOfConstant {
	public static void main(String[] args) {  
          int[] array={1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0};

		  try {  
			  //ConstantZero(array);
		  } catch (Exception e) {  
		      System.out.println("array out of boudary");// catch ArrayIndexOutOfBoundException£¬because index add more than length 
		  }  
		}  

	public boolean ConstantZero(int[] array) {  
	  int total=array.length;
	  int num=0; // calculator 
	  int index=0;
	  

	  while(num < total)
	  {
		  if(array[num]!=0 && array[num]!=1){
			  return false;
		  }else{
			  if(array[num]!=0){
					num++;
				}else{
					String sZero="";
					index=num;
					if(array[num+1]==0){
						while(array[num]==0 && (num+1 <= total)){
							sZero=sZero+array[num];
							num++;
							if(num >=total)
								break;
						}
						System.out.println(sZero + " occurs @ index ->" + index);
					}else{
						num++;
					}
				}
		   }
	  }//end while
	  return true;
	}  
}
