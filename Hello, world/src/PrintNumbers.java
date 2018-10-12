public class PrintNumbers {

	public static void main(String[] args) {

		ArrayFromOneToHundred();

	}

	public static void printingOneToTen() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}


	public static void printingHundedToNineHundedAndNinentyNine() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}

	public static void ArrayFromOneToHundred() {
		int[] arrayOfInts = new int[101];

		for (int i = 1; i <= 100; i++) {
			arrayOfInts[i] = i;
			System.out.println(arrayOfInts[i]);
		}
	}

}
