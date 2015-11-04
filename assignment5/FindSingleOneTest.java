import static org.junit.Assert.*;

import org.junit.Test;

public class FindSingleOneTest {

	@Test
	public void testSingleNumber() {
		//fail("Not yet implemented");
		FindSingleOne fso = new FindSingleOne();
		int[] array={0,0,1,1,2,2,3,4,4,3,5,6,7,5,6,7,11,13,13,11,34};
		int value=0;
		value = fso.singleNumber(array);
		assertEquals(34, value);
	}

}
