package com.main;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		Calculate cal = new Calculate();
		cal.setScore(score);
		
		System.out.println(cal.calculateGrade());
	}

}
