package by.htp.lsn;

import java.io.*;

public class L3T9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// AdditionalBasicTasks array3
		int tmp = 0;
		int[][] arr = new int[7][5];
		for (int i = 0; i < 7; i++) {
			for (int k = 0; k < 5; k++) {
				arr[i][k] = (int) (Math.random() * 10);
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter line1(0-6):");
		int a = Integer.parseInt(reader.readLine());
		System.out.print("enter line2(0-6):");
		int b = Integer.parseInt(reader.readLine());

		for (int k = 0; k < 5; k++) {
			tmp = arr[b][k];
			arr[b][k] = arr[a][k];
			arr[a][k] = tmp;
		}

		for (int i = 0; i < 7; i++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}

	}

}
