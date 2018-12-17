package test;
import static org.junit.Assert.*;
import org.junit.Test;
import default package.MetodCalc;
import defaultpackage.tax;
public class ee {
	tax tax = new tax();
	@Test
	public void testTax()
	 {
	
	 double res= tax.calcTax(500000, 2, 13);
	 double toch=64636.0;
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }
}
