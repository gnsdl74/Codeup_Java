package edu.java.basic100_1;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 a,b 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = num1%num2;
		sc.close();
		
		System.out.println(total);
		
	} // end main()

} // end Exercise26
