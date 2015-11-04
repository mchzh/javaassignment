import static org.junit.Assert.*;

import org.junit.Test;

public class HashMapWithArrayTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		HashMapWithArray hashMap = new HashMapWithArray();
//		has.put(10, 21);
//		int value = has.get(10);
//		assertEquals(21, value);
		hashMap.put(10, 20);
	    hashMap.put(20, 11);
	    hashMap.put(21, 1);
	    hashMap.put(20, 10);

	    int value = hashMap.get(20);
	    assertEquals(11, value);
	}

}
