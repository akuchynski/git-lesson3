package by.htp.lsn;

public class L3T10 {

	public static void main(String[] args) {
		// AdditionalBasicTasks array4
		int[][] arr = new int[5][5];
		int[] arr2 = new int[5];
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				arr[i][k] = (int) (Math.random() * 10);
				if (arr[i][k] > arr2[k])
					arr2[k] = arr[i][k];
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i : arr2) {
			System.out.print(i);
		}

	}

}
