package _02_fibonacci;

public class fibonacci {
	public static void main(String[] args) {
		int zero = 0;

		int one = 1;

		System.out.println(zero);
		System.out.println(one);
		for (int i = 0; i < 12; i++) {
			int fib = zero + one;
			System.out.println(fib);
			zero = one;
			one = fib;

		}
	}

}
