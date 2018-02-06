package by.htp.lsn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L3T11 {
	// AdditionalBasicTasks array5
	public static void main(String[] args) throws NumberFormatException, IOException {
		int j = 0;
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				arr[i][k] = (int) (Math.random() * 10);
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter number:");
		int x = Integer.parseInt(reader.readLine());

		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				if (x == arr[i][k])
					j++;
			}
		}
		System.out.println("found:" + j);
	}

}
