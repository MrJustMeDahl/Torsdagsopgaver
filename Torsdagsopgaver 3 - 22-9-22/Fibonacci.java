public class Fibonacci{
	
	public static void main(String[] args) {
		fibonacci(1, 5);
	}

	public static void fibonacci(int a, int b){

		for(int i = 0; i < 1000; i++){

			System.out.println(a);

			a = a + b;
			b = a - b;

			if(a > 1000){

				i = 1001;

			}
		}

	}

}