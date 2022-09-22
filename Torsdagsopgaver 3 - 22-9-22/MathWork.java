import java.util.Random;

public class MathWork{
	
	static int arr[] ={1,1,1,2,2,3,3,3,4,5,6,6,7,8,8,9,9,10};

	public static void main(String[] args) {
		divisble(10);
		//int test = getRandom(arr);
		//System.out.println(test);
		printSelf(20);
	}


	public static void divisble(int a){
		//Run through numbers from 0 - 100 if the number modulus the argument is 0 - print
		for(int i = 0; i <= 100; i++){
			if(i%a == 0){

				System.out.println(i);

			}
		}
	}

	/*public static int getRandom(int[] testArray){
		//Set a variable to a random number between 0 and array length.
		Random r = new Random();
		int indexInArray = r.nextInt(testArray.length());

		return indexOfArray;
	}
	*/
	public static void printSelf(int a){

		for(int i = a; i >=0; i--){

			System.out.println(i);

		}

	}
}