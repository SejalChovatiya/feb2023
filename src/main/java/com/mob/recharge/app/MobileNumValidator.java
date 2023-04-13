package com.mob.recharge.app;

class MobileNumValidator {
	boolean isValidNumber(int n) {
		return String.valueOf(n).length() == 10;	
	}
}
