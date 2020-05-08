package com.elviana;
import java.util.Scanner;
//belajar  looping
public class Looping {
	public static void main(String[] args) {
		//ini adalah keyboard untuk mengisi input nilai looping
		System.out.print("masukan nilai : ");
		Scanner scan = new Scanner(System.in);
		int nilai = scan.nextInt();
		//ini adalah looping / perulangan
		//looping ke 1
		//blok pengulangan bagian luar
		for (int i = 1; i <= nilai; i++) {
			//blok pengulangan bagian dalam untuk mencetak spasi
			for (int x = 1; x < i; x++) {
				System.out.print("  ");
			}
			//blok pengulangan bagian dalam untuk mencetak -> >
			for (int x = 1; x <= i; x++) {
				System.out.print(">");
			}
			//untuk ganti baris setiap pengulangan dilakukan
			System.out.print("\n");
		}
		//looping ke 2
		for (int i = nilai; i <= nilai; i++){
			for (int x = 1; x <= i; x++) {
				System.out.print("  ");
			}
			for (int x = 0; x <= i; x++) {
				System.out.print(">");
			}
			System.out.print("\n");
		}
		//looping ke 3
		for (int i = 1; i <= nilai; i++) {
			for (int x = i; x < nilai; x++) {
				System.out.print("  ");
			}
			for (int x = i; x <= nilai; x++) {
				System.out.print(">");
			}
			System.out.print("\n");
		}
		System.out.print("program selesai" + "\n");
	}
}
