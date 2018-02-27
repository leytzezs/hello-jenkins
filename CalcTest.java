import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {


	
	@Test
	void addSub(){
		Calc c = new Calc();
		assertTrue(5 == c.sub(2,3));
	}

}
