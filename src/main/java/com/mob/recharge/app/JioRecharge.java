package com.mob.recharge.app;

public class JioRecharge {
	MobileNumValidator op; // aggregation

	public String recharge(int mobileNumber) {
		op.isValidNumber(mobileNumber);
		if (op.isValidNumber(mobileNumber)) {
			System.out.println("Proceed with recharge");
		} else {
			System.out.println("Not Valid Number");
		}
		return "";
	}
}
