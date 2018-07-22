public class Fibonacci {

	public int Fibonacci(int number)

	{

		if (number == 0 || number == 1)

		{

			return number;

		}

		return (Fibonacci(number - 1)) + (Fibonacci(number - 2));

	}
}
