import java.util.HashMap;
import java.util.Stack;
public class ValidParenthese {

	public static void main(String arg[]){
		String model="()[]{}";
		boolean flag;
		flag = isValid(model);
		System.out.println("Single number result -> " + flag);
	}
	
	public boolean isValid(String s) {
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++){
			char char_set = s.charAt(i);
			
			if(map.keySet().contains(char_set)){
				stack.push(char_set);
			}else{
				if( !map.containsValue(char_set) ){
					throw new StringIndexOutOfBoundsException();
				}else{
					if(!stack.empty()){
						if( char_set == map.get(stack.peek())){
							stack.pop();
					    }else{
						    return false;
					    }
				    }
				}	
		    }
		}

		if(stack.empty())
			return true;
		return false;
	}
}

