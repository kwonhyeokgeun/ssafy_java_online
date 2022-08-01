package com.ssafy.live0801;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("우리는 몇기?");
		int no = sc.nextInt();
		System.out.println("우리는 "+no+"기");
		
		System.out.println("우리를 대표하는 한마디");
		sc.nextLine(); //이게 없으면 이상하게 동작함.
		String msg = sc.nextLine();
		System.out.println("한마디 : "+msg);

	}

}
