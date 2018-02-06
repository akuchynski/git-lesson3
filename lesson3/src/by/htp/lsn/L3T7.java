package by.htp.lsn;

public class L3T7 {

	public static void main(String[] args) {

		int max = 0;
		int[] arr = new int[10];
		double[] arr2 = new double[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000);
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println("\n" + "maximum num: " + max);

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = (double)arr[i] / (double)max;
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("%.2f" + " ", arr2[i]);
		}

	}

}
