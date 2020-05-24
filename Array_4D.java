package com.elviana;
import java.util.Arrays;
//belajar cara inisialisasi Array 4 dimensi
//Array_4D[2 x 2 x 3 x 3] = 2 buku 2 halaman 3 baris 3 kolom
public class Array_4D {
	public static void main(String[] args) {
		System.out.println("\t \t \t \t \t \t \t \t \t \t Array 4 dimensi \n");
		//mendeklarasikan data Array
		int[][][][] Array_4D = {
			{	//mengisi nilai halaman ke 1 buku 1
				{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, }, 
				//mengisi nilai halaman ke 2 buku 1
				{ {-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9} } 
			},
			{	//mengisi nilai halaman ke 1 buku 2
				{ {10, 20, 30}, {40, 50, 60}, {70, 80, 90}, },
				//mengisi nilai halaman ke 2 buku 2
				{ {-10, -20, -30}, {-40, -50, -60}, {-70, -80, -90} }
			}
		};
		//looping untuk menampilkan nilai data Array
		//blok pengulangan untuk mencetak buku
		for (int buku = 0; buku < 2; buku++) {
			System.out.print("buku ke-" + (buku+1));
			//blok pengulangan untuk mencetak halaman
			for (int halaman = 0; halaman < 2; halaman++) {
				System.out.println("\n" + "halaman ke-" + (halaman+1));
				//blok pengulangan untuk mencetak baris
				for (int baris = 0; baris < 3; baris++) {
					System.out.print("\n" + "[ | ");
					//blok pengulangan untuk mencetak kolom
					for (int kolom = 0; kolom < 3; kolom++) {
						//menampilkan nilai hasil dari pengulangan
						System.out.print(Array_4D[buku][halaman][baris][kolom] + " | ");
					}
					System.out.print("]");
				}
				//untuk ganti baris setiap pengulangan dilakukan
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		//menampilkan nilai buku 1 halaman 1 baris 1 kolom 2
		System.out.println("nilai index Array_4D[0][0][0][1] = [ " + Array_4D[0][0][0][1] + " ]");
		//menampilkan nilai buku 1 halaman 2 baris 1 kolom 2
		System.out.println("nilai index Array_4D[0][1][0][1] = [ " + Array_4D[0][1][0][1] + " ]");
		//menampilkan nilai buku 2 halaman 1 baris 1 kolom 1
		System.out.println("nilai index Array_4D[1][0][0][0] = [ " + Array_4D[1][0][0][0] + " ]");
		//menampilkan nilai buku 2 halaman 2 baris 1 kolom 1
		System.out.println("nilai index Array_4D[1][1][0][0] = [ " + Array_4D[1][1][0][0] + " ]");
		//menampilkan informasi program
		System.out.print("\n" + "program selesai" + "\n" + ">_");
	}
}
