import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testEqualsObject() {
		//fail("Not yet implemented");
		Person[] p = {new Person(001, "Siva", "S"),
                      new Person(002, "Siva", "S"),
		              new Person(001, "Siva", "S"),
		              new Person(003, "Yang", "Z"),
		              new Person(002, "Yang", "S")
		             };
		boolean[] btry = new boolean[10];
		boolean[] bbegin = new boolean[10];
		int left;
		int right;
		int count=0;
		for(int i=0; i<p.length; i++){
			left=i;right=p.length-1;
			while(left != right){
				btry[count] = p[left].equals(p[right]);
				right--;
				count++;
			}
		}
		for(int i=0; i<count; i++){
			bbegin[i] = true;
		}
		assertArrayEquals(bbegin, btry);
	}

}
