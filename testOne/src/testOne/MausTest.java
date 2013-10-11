package testOne;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MausTest {

	Maus maus;
	
	@Before
	public void setUp() throws Exception {
		
		maus = new Maus(1, 2);
		
	}

	@Test
	public void test() {
		maus.setX(0);
		assertEquals(0, maus.getX());
		maus.setY(5);
		assertEquals(5, maus.getY());
	}

}
