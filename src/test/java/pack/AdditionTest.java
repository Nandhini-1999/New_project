package pack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void tester() {
		Addition a=new Addition();
		int actual=a.add(20, 40);
		int expected=60;
		assertEquals(expected,actual);
		
	}
	@Test
	public void tester1() {
		Addition a=new Addition();
		int actual=a.add(25, 40);
		int expected=65;
		assertEquals(expected,actual);

	
		
	}
	
}

