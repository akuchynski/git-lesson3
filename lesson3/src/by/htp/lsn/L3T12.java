package by.htp.lsn;

public class L3T12 {

	public static void main(String[] args) {
		// AdditionalBasicTasks array6
		int a = 0;
		int b = 0;
		int j = 0;
		int[][] arr = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				arr[i][k] = (int) (Math.random() * 200);
				System.out.print(arr[i][k] + " ");
				if (arr[i][k] > 9 && arr[i][k] < 100) {
					a = arr[i][k] % 10;
					b = arr[i][k] / 10;
					if ((a + b) % 2 == 0)
						j++;
				}
			}
			System.out.println();
		}
		System.out.println("found:" + j);
	}

}
