package com.github.year.svc;

public class YearValidator {
	private static volatile YearValidator instance;

	private YearValidator() {}

	public static YearValidator getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (YearValidator.class) {
				if (instance == null) {
					instance = new YearValidator();
				}
			}
		}

		return instance;
	}

	public boolean isLeapYear(Long year) {
		// TODO: Fill method
		return false;
	}
}