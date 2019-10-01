
public class THELOOPGAUNTLET {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}
		for (int k = 0; k < 100; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}
		for (int l = 0; l < 100; l++) {
			if (l % 2 > 0) {
				System.out.println(l);
			}
		}
		for (int m = 0; m < 501; m++) {
			if (m % 2 > 0) {
				System.out.println(m + " odd");
			} else {
				System.out.println(m + " even");
			}
		}
		for (int n = 0; n < 12; n++) {
			System.out.println("In " + (2008 + n) + " I was " + n);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);

			}
		}

		for (int i = 0; i < 9; i += 3) {
			String nu = "";
			for (int j = 1; j < 4; j++) {
				int n = (i + j);
				nu += n + " ";

			}
			System.out.println(nu);

		}
		for (int i = 0; i < 100; i += 10) {
			String nu = "";
			for (int j = 1; j < 11; j += 1) {
				int n = (i + j);
				nu += n + " ";

			}
			System.out.println(nu);

		}
		for (int i = 0; i < 7; i++) {
			String ao = " ";
			for (int j = 0; j < i; j++) {
				ao += "*" + " ";
			}
			System.out.println(ao);
		}
for (int i = 0;i  < 101; i++) {
	System.out.println(100-i);
}
	}
}