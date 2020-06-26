
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class PrintAllPalindrome {

	public static void main(String[] args) {
		String input = "nitin";

		System.out.println("All possible palindrome" + "partions for " + input + " are :");

		allPalPartitions(input);
	}

	private static void allPalPartitions(String input) {
		int n = input.length();

		ArrayList<ArrayList<String>> allPart = new ArrayList<>();

		Deque<String> currPart = new LinkedList<String>();

		allPalPartitonsUtil(allPart, currPart, 0, n, input);

		System.out.println(allPart);

	}

	private static void allPalPartitonsUtil(ArrayList<ArrayList<String>> allPart, Deque<String> currPart, int start,
			int n, String input) {

		if (start >= n) {
			allPart.add(new ArrayList<>(currPart));
			return;
		}

		for (int i = start; i < n; i++) {

			if (isPalindrome(input, start, i)) {

				currPart.addLast(input.substring(start, i + 1));

				allPalPartitonsUtil(allPart, currPart, i + 1, n, input);

				currPart.removeLast();
			}
		}
	}

	private static boolean isPalindrome(String input, int start, int i) {
		while (start < i) {
			if (input.charAt(start++) != input.charAt(i--))
				return false;
		}
		return true;
	}
}
