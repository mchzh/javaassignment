import java.util.Scanner;

public class StrMatchPattern {
	
	// if the input is: "aaaa", "dog cat cat dog", your output is true. -5.
	public boolean wordPattern(String pattern, String str) {
		  String[] sarray = str.split(" ");
		  int plen = pattern.length();
		  int slen = sarray.length;
		  int middle = plen/2;
		  
		  if((plen != slen) || (plen%2 != 0))
			  return false;
		  
		  for(int i=0; i<middle; i++){
			  if( (i+1) != middle){
				  if(pattern.charAt(i) != pattern.charAt(i+1)){
					  if((pattern.charAt(i) != pattern.charAt(plen-i-1)) || 
							  !sarray[i].equals(sarray[slen-i-1]) ||
							   sarray[i].equals(sarray[i+1])){
						  return false;
					  }
				  }
			  }else{
					  if((pattern.charAt(i) != pattern.charAt(plen-i-1)) ||
							  !sarray[i].equals(sarray[slen-i-1]))
						  return false;
			  }
		  }
		  return true;
	}
}
