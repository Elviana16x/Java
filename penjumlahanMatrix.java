package com.elviana;
import java.util.Arrays;
//belajar membuat program penjumlahan matrix
public class penjumlahanMatrix {
	public static void main(String[] args) {
		//inisialisasi data matrix
		int[][] matrix_h = new int[2][2];
		int[][] matrix_y = new int[2][2];
		//benar jumlah baris dan kolom kedua matrix sama
		matrix_h[0][0] = 40; matrix_h[0][1] = 51; //baris 1 matrix h
		matrix_h[1][0] = 30; matrix_h[1][1] = 20; //baris 2 matrix h
		matrix_y[0][0] = 60; matrix_y[0][1] = 50; //baris 1 matrix y
		matrix_y[1][0] = 80; matrix_y[1][1] = 91; //baris 2 matrix y
		int[][] penjumlahan = plus(matrix_h, matrix_y);
		printMatrix(penjumlahan);
	}
	//melakukan perhitungan
	private static int[][] plus(int[][] matrix_h, int[][] matrix_y) {
		int baris_h = matrix_h.length;
		int kolom_h = matrix_h[0].length;
		int baris_y = matrix_y.length;
		int kolom_y = matrix_y[0].length;
		int[][] hasil = new int[baris_h][baris_y];
		//syarat penjumlahan matrix baris dan kolom harus sama
		if (baris_h == baris_y && kolom_h == kolom_y) {
			for (int i = 0; i < baris_h; i++) {
				for (int x = 0; x < baris_y; x++) {
					hasil[i][x] = matrix_h[i][x] + matrix_y[i][x];
				}
			}
		} else {
			//jika syarat salah kondisi else yang akan dijalankan
            System.out.println("salah baris atau kolom tidak sama");
		}
		return hasil;
	}
	//menampilkan hasil perhitungan
	private static void printMatrix(int[][] dataMatrix) {
		System.out.print("hasil pengurangan matrix" + "\n" + "\n");
		int baris_h = dataMatrix.length;
		int kolom_y = dataMatrix[0].length;
		for (int i = 0; i < baris_h; i++) {
			System.out.print("[ ");
			for (int x = 0; x < kolom_y; x++) {
				System.out.print(dataMatrix[i][x]);
				if (x < (kolom_y -1) ) {
					System.out.print("  ");
				} else {
					System.out.print(" ]");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n" + "program selesai" + "\n");
		System.out.print("\n" + ">_");
	}
}

