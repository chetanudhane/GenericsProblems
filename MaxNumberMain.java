package generics;

public class MaxNumberMain {

	public static void main(String[] args) {

		Integer x = 45, y = 12, z = 34;
		int maxInt = new FindMaximumNumber<Integer>(x, y, z).maximum();
		System.out.println("Maximum is : " + maxInt);

		Double x1 = 81.2, y1 = 73.45, z1 = 65.4;
		double maxDouble = new FindMaximumNumber<Double>(x1, y1, z1).maximum();
		System.out.println("Maximum is : " + maxDouble);

		String x11 = "Mumbai", y11 = "Pune", z11 = "India";
		String maxString = new FindMaximumNumber<String>(x11, y11, z11).maximum();
		System.out.println("Maximum is : " + maxString);

	}

}
