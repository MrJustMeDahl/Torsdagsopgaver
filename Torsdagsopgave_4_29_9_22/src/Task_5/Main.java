package Task_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> familyData = new ArrayList<>();
    public static void main(String[] args) {

        File family = new File("src/Task_5/FamilyNames.txt");
        try {
            Scanner fileReader = new Scanner(family);
            while (fileReader.hasNextLine()) {
                String s = fileReader.nextLine();
                familyData.add(s);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            System.out.println("File not found");
        }

        familyData.add("Sebastian Sørensen");
        familyData.add("Siri Sørensen");
        familyData.add("Bo Jørgensen");

        writeToFile();
    }

    public static void writeToFile(){
        try{
            FileWriter fileWriter = new FileWriter("src/Task_5/FamilyNames2");
            for (String f : familyData) {
                fileWriter.write(f);
            }
        } catch (IOException ex) {
            System.out.println(ex);
            System.out.println("Something went wrong");
        }

    }

}
