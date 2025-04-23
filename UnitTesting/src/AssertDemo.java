import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class AssertDemo {
	@Test
 public void checkassertequal() {
	 int res=1;
	 int exp=1;
	 assertEquals(res,exp);
 }
	@Test
	public void check() {
		assertFalse("Hello".contains("H"));
	}
	@Test
	public void another() {
		String s="hello";
		assertNull(s);
		
	}
	
	@Test
	public void testassumption() {
		int a=5, s=25;
		Assumptions.assumeTrue(s==a*a);
		System.out.println("hi");
	}
}
