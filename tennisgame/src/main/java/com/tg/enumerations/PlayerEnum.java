package com.tg.enumerations;

/*
 * Author: pedro.ferreira
 * */
public enum PlayerEnum {
	PLAYER_A("A"),
	PLAYER_B("B");

	String val = null;

	PlayerEnum(String value) {
		this.val = value;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
}
