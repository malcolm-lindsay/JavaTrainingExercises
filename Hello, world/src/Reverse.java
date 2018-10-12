
public class Reverse {
	public static void main(String[] args) {

		String str = "hello";
		String newStr = " ";
		char[] strArray = str.toCharArray();

		for (int i = strArray.length - 1; i > -1; i--) {
			char tempChar = strArray[i];
			newStr += tempChar;

		}

		System.out.println(newStr);
	}
}
