import java.util.LinkedList;
import java.util.List;

public class MyStack {
	//define two queue to finish stack
	private LinkedList<Integer> queue1 = new LinkedList<Integer>();
	private LinkedList<Integer> queue2 = new LinkedList<Integer>();

	// push element x onto stack
	public void push(int x){		
		if(!queue1.isEmpty()){
			try{
				queue1.add(x);
			}catch(IllegalStateException ie){
				System.out.println("Queue1 space is not enough!");
				return;
			}
		}else{
			try{
				queue2.add(x);
			}catch(IllegalStateException ie){
				System.out.println("Queue2 space is not enough!");
				return;
			}
		}
	}
	
	// Removes the element on top of the stack
	public void pop(){
		if(queue1.size() == 0 && queue2.size() == 0){
			return;
		}
		if(queue1.isEmpty()){
			LinkedList<Integer> tmp = queue1;
			queue1 = queue2;
			queue2 = tmp;
		}
		while(queue1.size()>1){
			//int nq = queue1.remove(0);
			try{
				queue2.add(queue1.remove(0));
			}
			catch(IllegalStateException ie){
				System.out.println("Queue2 space is not enough!");
				return;
			}
		}
		queue1.clear();
	}
	
	// Get the top element
	public int top(){
		if(queue1.size() == 0 && queue2.size() == 0){
			return -1;
		}
		if(queue1.isEmpty()){
			LinkedList<Integer> tmp = queue1;
			queue1 = queue2;
			queue2 = tmp;
		}
		while(queue1.size()>1){
			//int nq = queue1.remove(0);
			try{
				queue2.add(queue1.remove(0));
			}
			catch(IllegalStateException ie){
				System.out.println("Queue2 space is not enough!");
				return -1;
			}
		}
		return queue1.element();
	}
	
	// Return whether the stack isempty
	public boolean empty(){
		return queue1.isEmpty() && queue2.isEmpty();
	}
}
