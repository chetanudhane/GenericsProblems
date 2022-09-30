package generics;

public class FindMaximumNumber<T extends Comparable<T>> {

	T x, y, z;

	public static <T extends Comparable<T>> T maximumIs(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
