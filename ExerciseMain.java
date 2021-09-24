package com.lmats.oms.util;

import java.io.IOException;
import java.util.Scanner;

public class ExerciseMain {

	public static void main(String[] args) throws IOException {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String str = sc.nextLine();
//			String str = "//[***]\\n10*2***3";
			System.out.println(findSum(str));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int findSum(String str) {
		String temp = "0";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || ch == '-') {
				temp += ch;
			} else {
				if (temp.contains("-")) {
					System.out.println("negatives not allowed");
					return 0;
				} else if (Integer.parseInt(temp) < 1000) {
					sum = sum + Integer.parseInt(temp);
				} else {
					sum = sum + 0;
				}
				temp = "0";
			}
		}
		if (temp.contains("-")) {
			System.out.println("negatives not allowed");
			return 0;
		} else if (Integer.parseInt(temp) < 1000) {
			return sum + Integer.parseInt(temp);
		} else {
			return sum;
		}
	}
}