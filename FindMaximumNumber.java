package generics;

import java.util.Arrays;

public class FindMaximumNumber<T extends Comparable<T>> {

	T[] array;

	public FindMaximumNumber(T[] array) {
		this.array = array;
	}

	public T maximum() {
		return FindMaximumNumber.maximumIs(array);
	}

	public static <T extends Comparable<T>> T maximumIs(T[] array) {
		for (int k = 0; k < array.length - 1; k++) {
			for (int i = 0; i < array.length - k - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					T temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array " + Arrays.toString(array));
		printMax(array);
		return array[array.length - 1];
	}

	public static <T> void printMax(T[] array) {
		System.out.println("Maximum from the above array is " + array[array.length - 1] + "\n");
	}
}
