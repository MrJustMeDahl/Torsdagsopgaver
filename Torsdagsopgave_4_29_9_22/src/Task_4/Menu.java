package Task_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<String> options = new ArrayList<>();

    public Menu(ArrayList<String> list){
        options = list;
    }

    public String showMenu(){
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Type a number to choose :");
        for (String option : options) {
            System.out.println(option);
        }
        String choice = userChoice.nextLine();
        return choice;
    }
}
