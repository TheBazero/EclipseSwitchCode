package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please insert your birth month: ");
        String month = scan.next();
        String season = "Unknown";
        if (month.equals("December") || month.equals("January") || month.equals("February")){
        	season = "winter";
        } else if (month.equals("March") || month.equals("April") || month.equals("May")){
        	season = "spring";
       
	}else if (month.equals("June") || month.equals("July") || month.equals("August")){
    	season = "summer";

}else if (month.equals("September") || month.equals("October") || month.equals("November")){
	season = "autmn";
//}else {
//	season = "unknown";
//	
//}
	}
	System.out.println("You were born in " + season);
	

         }}
        
        
       
	
