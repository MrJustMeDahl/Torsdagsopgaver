

public class Palindrome{
	
	public static void main(String[] args) {
		printIfPalindrome("den laks skal ned");
	}
	//Method to check if sentences are the same spelled backwards
	public static void printIfPalindrome(String PalindromeCheck){
		//String argument is entered in a char array
		char charArray[] = PalindromeCheck.toCharArray();
		//Char array is made entering values into a new string backwards
		String PalindromeCheckBackwards = "";
		
		for(int i = charArray.length-1; i >= 0; i--){

			PalindromeCheckBackwards += charArray[i];

		}
		//If the original string and the new string is the same - print.
		if(PalindromeCheck.toLowerCase().equals(PalindromeCheckBackwards.toLowerCase())) {
			System.out.println(PalindromeCheck);
		}
	}

}