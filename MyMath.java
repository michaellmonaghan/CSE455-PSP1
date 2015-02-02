import java.util.Scanner;

class MyMath {
	
	public static double mean(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;
	}
	
	public static double stdDeviation(double[] numbers) {
		double mean = mean(numbers);
		double sum = 0;
		for (double number : numbers) {
			double difference = number - mean;
			sum += difference * difference;
		}
		return Math.sqrt(sum/(numbers.length-1));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length:");
		double[] numbers = new double[s.nextInt()];
		System.out.println("Enter numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = s.nextDouble();
		}
		System.out.println(stdDeviation(numbers));
	}
}