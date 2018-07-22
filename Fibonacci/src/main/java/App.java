public class App {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		long start = System.currentTimeMillis();
		System.out.println(fibonacci.Fibonacci(100));
		long end = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (end - start));
	}
}
