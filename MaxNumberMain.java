package generics;

public class MaxNumberMain {

	public static void main(String[] args) {

		Integer[] integerArray = { 55, 23, 53, 45, 12, 34 };
		Double[] doubleArray = { 43.33, 23.45, 56.23, 12.45, 25.23, 33.23 };
		String[] stringArray = { "Chetan", "Ajay", "Mumbai", "Pune", "India", "Aniket" };

		new FindMaximumNumber<Integer>(integerArray).maximum();
		new FindMaximumNumber<Double>(doubleArray).maximum();
		new FindMaximumNumber<String>(stringArray).maximum();
	}

}
