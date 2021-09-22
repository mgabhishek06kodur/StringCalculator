package com.lmats.oms.util;

import java.io.IOException;

public class ExerciseMain {

	public static void main(String[] args) throws IOException {
		try {
			String str = "//[***]\\n10*2***3";
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
					return sum;
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