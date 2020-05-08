package com.elviana;
import java.util.Scanner;
//belajar membuat fibonacci
public class fibonacci {
	public static void main(String[] args) {
		//mendeklarasikan variabel
		System.out.print("fibonacci" + "\n");
		int fib_1 = 1;
		int fib_2 = 0;
		int fib = fib_1 + fib_2;
		String nama;
		//keboard untuk mengisi input variabel nama
		System.out.print("masukan nama : ");
		Scanner string = new Scanner(System.in);
		nama = string.nextLine();
		System.out.print("hy " + nama + "\n");
		//keyboard  untuk mengisi input nilai looping
		System.out.print("masukan nilai : ");
		Scanner scan = new Scanner(System.in);
		int nilai = scan.nextInt();
		//looping
		for (int x = 1; x <= nilai; x++) {
			System.out.print(fib + "\n");
			fib = fib_1 + fib_2;
			fib_2 = fib_1;
			fib_1 = fib;
		}
	}
}
