package zero;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ZeroOfConstantTest {

	private static ZeroOfConstant zerocon=new ZeroOfConstant();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConstantZero() {
		int[] narray={1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0};
		assertTrue(zerocon.ConstantZero(narray));
		//fail("Not yet implemented");
	}

}
