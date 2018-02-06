package by.htp.lsn;

public class L3T8 {

	public static void main(String[] args) {
		// AdditionalBasicTasks array2
		double[] arrA = new double[20];
		int j = 0;
		int k = 0;
		double sum = 0;

		System.out.print("arrA: ");
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = Math.random() * 10 - 5;
			System.out.printf("%.2f" + " ", arrA[i]);
		}

		for (int i = 1; i < arrA.length; i += 2) {
			if (arrA[i] > 0)
				j++;
		}
		System.out.println("\n" + "arrB length: " + j);

		double[] arrB = new double[j];

		System.out.print("arrB: ");
		for (int i = 1; i < arrA.length; i += 2) {
			if (arrA[i] > 0) {
				arrB[k] = arrA[i];
				System.out.printf("%.2f" + " ", arrB[k]);
				sum = sum + Math.pow(arrB[k], 2);
				k++;
			}
		}

		System.out.printf("\n" + "sum sq: " + "%.2f", sum);
	}

}
