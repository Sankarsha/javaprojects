package demo.java;

public class novowels {
		public static void main(String[] args) {
		String str = "sankarshana";

		int[] counters = new int[5];

		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (ch == 'a' || ch == 'A') {
		counters[0]++;
		} else if (ch == 'e' || ch == 'E') {
		counters[1]++;
		} else if (ch == 'i' || ch == 'I') {
		counters[2]++;
		} else if (ch == 'o' || ch == 'O') {
		counters[3]++;
		} else if (ch == 'u' || ch == 'U') {
		counters[4]++;
		}
		}

		System.out.println("Count of 'a' = " + counters[0]);
		System.out.println("Count of 'e' = " + counters[1]);
		System.out.println("Count of 'i' = " + counters[2]);
		System.out.println("Count of 'o' = " + counters[3]);
		System.out.println("Count of 'u' = " + counters[4]);
		}
		}

