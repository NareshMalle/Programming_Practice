package com.naresh.practice.programs;

import java.util.Scanner;

public class If_condition {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		if(a>b) {
			System.out.println(a+" is the the big value ");
		}
		else {
			System.out.println(b+" is the the big value ");
		}
	}

}
