package Task_6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData(){
        File file = new File("src/Task_6/coffees.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                coffeeMenu.add(fileReader.nextLine());
            }
        } catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }
}
