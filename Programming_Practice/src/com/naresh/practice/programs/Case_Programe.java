package com.naresh.practice.programs;

import java.util.Scanner;

public class Case_Programe {
	public static void main(String[] args) {
		System.out.println("enter the payment option");
		String Option = new Scanner(System.in).next();
		switch(Option){
			case "debitcard":
				System.out.println("paid from debit card ");
				break;
			case "credicard":
				System.out.println("paid from debit card ");
				break;
			case "forexcard":
				System.out.println("paid from debit card ");
				break;
			default :
				System.out.println("option is not Supported ");
			
		}
		}
	}