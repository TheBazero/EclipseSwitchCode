package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		int hour =21;
		String dayTime;
		if (hour >= 1 && hour <= 11) {
			dayTime = "morning";
//		System.out.println(" It is Morning");
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "Afternoon";
//			System.out.println(" It is Afternoon");
		}else if (hour >= 16 && hour <= 20) {
			dayTime = "Evening";
//			System.out.println(" It is Evening");
		}else if (hour >= 21 && hour <= 24) {
			dayTime = "Night";
//			System.out.println(" It is Night");

//	}else {
//		dayTime = "unknown";
////		System.out.println("Wrong pattern");
//		System.out.println("Right now is " + dayTime);
	} else{
		dayTime="unknown";
	}if (!dayTime.equals("unknown")) {
		System.out.println("Right now is " + dayTime);
	}
			

	}}
