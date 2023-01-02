package com.bridgelabz.gradecheck;
import java.util.Scanner;
public class CheckingGrade {
public static void main(String args[]) {
	System.out.println("enter your marks percentage:");
	Scanner scan = new Scanner(System.in);
	int percentage = scan.nextInt();
	if (percentage<0 || percentage>100) {
	  System.out.println("entered percentage is invalid:");
	}
	  else if(percentage>70) {
		  
	  System.out.println("you got first class with distinction:");
	}else if (percentage <= 70 && percentage > 60 ) {
		  System.out.println("you got first class marks:");

	}else if(percentage <= 60 && percentage > 50) {
		  System.out.println("you got second class marks:");

	}else if(percentage <= 50 && percentage>40) {
		  System.out.println("you are just passed:");

	}else {
		  System.out.println("you are failed:");

	}

}
}