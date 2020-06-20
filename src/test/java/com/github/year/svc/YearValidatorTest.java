package com.github.year.svc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class YearValidatorTest {
	@Test
	public void testYearsDivisibleBy400AreLeap() {
		assertTrue(YearValidator.getInstance().isLeapYear(400L));
		assertTrue(YearValidator.getInstance().isLeapYear(800L));
		assertTrue(YearValidator.getInstance().isLeapYear(2000L));
	}
}
