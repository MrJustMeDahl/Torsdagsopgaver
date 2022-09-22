public class PartOfWord{
	
	public static void main(String[] args) {
		printPartOfWord("København", 1, 4);
	}
	
	public static void printPartOfWord(String s, int index, int numbOfChars){

		String output = s.substring(index, index+numbOfChars);

		System.out.println(output);

	}

}