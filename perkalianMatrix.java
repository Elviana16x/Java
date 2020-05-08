package com.elviana;
import java.util.Arrays;
//belajar membuat program perkalian matrix
public class perkalianMatrix {
	public static void main(String[] args) {
		//inisialisasi data matrix
		int[][] matrix_a = new int[2][2];
		int[][] matrix_b = new int[2][2];
		matrix_a[0][0] = 2; matrix_a[0][1] = 4; //baris 1 matrix a
		matrix_a[1][0] = 5; matrix_a[1][1] = 9; //baris 2 matrix a
		matrix_b[0][0] = 5; matrix_b[0][1] = 7; //baris 1 matrix b
		matrix_b[1][0] = 8; matrix_b[1][1] = 2; //baris 2 matrix b
		int[][] perkalian = x(matrix_a, matrix_b);
		printMatrix(perkalian);
	}
	//melakukan perhitungan
	private static int[][] x(int[][] matrix_a, int[][] matrix_b) {
		int baris_a = matrix_a.length;
		int kolom_a = matrix_a[0].length;
		int baris_b = matrix_b.length;
		int kolom_b = matrix_b[0].length;
		int[][] hasil = new int[baris_a][kolom_b];
		//syarat perkalian matrix baris 1 dan kolom 2 harus sama
		if (baris_a == kolom_b) {
			int buffer;
			for (int i = 0; i < baris_a; i++) {
				for (int x = 0; x < kolom_b; x++) {
					//setiap looping nilai akan dimulai dari nol
					buffer = 0;
					for (int c = 0; c < kolom_a; c++) {
						buffer += matrix_a[i][c] * matrix_b[c][x];
					}
					hasil[i][x] = buffer;
				}
			}
		} else {
			//jika syarat salah kondisi else yang akan dijalankan
			System.out.println("kolom 1 dan baris 2 tidak sama");
		}
		return hasil;
	}
	//menampilkan hasil perhitungan
	private static void printMatrix(int[][] dataMatrix) {
		System.out.print("hasil perkaliam matrix" + "\n" + "\n");
		int baris_a = dataMatrix.length;
		int kolom_b = dataMatrix[0].length;
		for (int i = 0; i < baris_a; i++) {
			System.out.print("[ ");
			for (int x = 0; x < kolom_b; x++) {
				System.out.print(dataMatrix[i][x]);
				if (x < (kolom_b -1) ) {
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
