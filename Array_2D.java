package com.pinkly;
import java.util.Scanner;
//belajar melakukan increment dan decrement  pada Array 2 dimensi
public class brainOut {
	public static void main(String[] args) {
	
		int Data_Array_2D [] [] = new int [4] [2];
		
		Data_Array_2D [0] = new int [1];
		Data_Array_2D [1] = new int [2];
		Data_Array_2D [2] = new int [3];
		Data_Array_2D [3] = new int [4];
		int X = 0;
		
		System.out.print("masukan input : ");
		Scanner Array = new Scanner(System.in);
		int input = Array.nextInt();
		
		System.out.println("\n" + "melakukan increment" + "\n");
		for (int A = 0; A < input; A++) {
			for (int B = 0; B < A + 1; B++) {
				Data_Array_2D [A][B] = X;
				X += 1;
			}
		}
		for (int A = 0; A < input; A++) {
			for (int B = 0; B < A + 1; B++) {
				System.out.print("[ " + Data_Array_2D [A][B] + " ]");
			}
			System.out.print("\n");
		}
		System.out.println("\n" + "melakukan decrement" + "\n");
		for (int C = 0; C  < input; C++) {
			for (int D = 0; D < C + 1; D++) {
				Data_Array_2D [C][D] = X - 1;
				X -= 1;
			}
		}
		for (int C = 0; C < input; C++) {
			for (int D = 0; D < C + 1; D++) {
				System.out.print("[ " + Data_Array_2D [C][D] + " ]");
			}
			System.out.print("\n");
		}
		System.out.print("\n" + "program selesai" + "\n" + ">_");
	}
}