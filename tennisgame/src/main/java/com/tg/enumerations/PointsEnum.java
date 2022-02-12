package com.tg.enumerations;

import java.util.Arrays;
import java.util.List;

/*
 * Author: pedro.ferreira
 * */
public enum PointsEnum {
	POINT_0("0"),
	POINT_15("15"),
	POINT_30("30"),
	POINT_40("40");
	
	String val = null;

	PointsEnum(String value) {
		this.val = value;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	public static List<String> getTennisPoints() {
		List<String> lstTennisPoints = Arrays.asList(
				PointsEnum.POINT_0.getVal(), 
				PointsEnum.POINT_15.getVal(),
				PointsEnum.POINT_30.getVal(),
				PointsEnum.POINT_40.getVal(),
				PointsEnum.POINT_40.getVal());
		return lstTennisPoints;
	}
}
