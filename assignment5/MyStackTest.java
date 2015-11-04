import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertFalse(stack.empty());
		assertEquals(3, stack.top());
		stack.pop();		
	}

}
