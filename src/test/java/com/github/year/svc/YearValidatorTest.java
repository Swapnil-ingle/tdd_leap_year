package com.github.year.svc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class YearValidatorTest {
	@Test
	public void testYearsDivisibleBy400AreLeap() {
		assertTrue(YearValidator.getInstance().isLeapYear(400L));
		assertTrue(YearValidator.getInstance().isLeapYear(800L));
		assertTrue(YearValidator.getInstance().isLeapYear(2000L));
	}

	@Test
	public void testYearsDivisibleBy100ButNot400AreNotLeap() {
		assertFalse(YearValidator.getInstance().isLeapYear(100L));
		assertFalse(YearValidator.getInstance().isLeapYear(500L));
		assertFalse(YearValidator.getInstance().isLeapYear(1300L));
	}

	@Test
	public void testYearsDivisibleBy4ButNot100AreLeap() {
		assertTrue(YearValidator.getInstance().isLeapYear(2008L));
		assertTrue(YearValidator.getInstance().isLeapYear(2012L));
		assertTrue(YearValidator.getInstance().isLeapYear(2016L));
	}

	@Test
	public void testAllYearsNotDivisibleBy4AreNotLeap() {
		assertFalse(YearValidator.getInstance().isLeapYear(2017L));
		assertFalse(YearValidator.getInstance().isLeapYear(2018L));
		assertFalse(YearValidator.getInstance().isLeapYear(2019L));
	}

	@Test
	public void testAllYearsDivisibleBy4000AreNotLeap() {
		assertFalse(YearValidator.getInstance().isLeapYear(4000L));
		assertFalse(YearValidator.getInstance().isLeapYear(8000L));
		assertFalse(YearValidator.getInstance().isLeapYear(12000L));
	}
}
