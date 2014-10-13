package CalcUT;

import static org.junit.Assert.*;

import org.junit.Test;

import CalcEngine.CalcEngine;

public class CalcUT extends CalcEngine {
	@Test
	public final void test() {
		CalcEngine test = new CalcEngine();
		double result = test.futureInvestmentValue(10000, .02, 20);
		assertEquals(14859.473959783549,result,.001);
	}

}