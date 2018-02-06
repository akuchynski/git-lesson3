package by.htp.lsn;

public class L3T6 {

	public static void main(String[] args) {
		// AdditionalBasicTasks while2
		int n = 123456788;
		int sum = 0;
		int num = 0;

		System.out.println("num:" + n);
		while (n > 0) {
			num = n % 10;
			if (num % 2 == 0) {
				sum += num;
			}
			n = n / 10;
		}

		System.out.println("sum:" + sum);
	}

}
