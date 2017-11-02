import static org.junit.Assert.*;

import org.junit.Test;

public class testBMI {

	@Test
	public void test() {
		String metric = "SI", result;
		double weight=60, height=1.8;
		result = BodyTypeCheckWithBMI.checkBodyType(metric, weight, height);
		assertEquals("Okay", result, "Normal" );	
	}
	@Test
	public void test2() {
		String metric = "usc", result;
		double weight=160, height=70;
		result = BodyTypeCheckWithBMI.checkBodyType(metric, weight, height);
		assertEquals("Okay", result, "Normal" );	
	}
	@Test
	public void test3() {
		String metric = "usc", result;
		double weight=250, height=60;
		result = BodyTypeCheckWithBMI.checkBodyType(metric, weight, height);
		assertEquals("Okay", result, "Obese" );	
	}
	
}
