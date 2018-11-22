package program;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		//assertEquals(50, SampleAdd.add(25 ), 0);
		assertEquals(50, SampleAdd.add(25, 25), 0);
	}

}
