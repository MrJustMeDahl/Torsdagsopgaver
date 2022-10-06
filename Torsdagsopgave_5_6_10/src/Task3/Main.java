package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Costumer> costumer = new ArrayList<>();

    public static void main(String[] args) {
        costumer.add(new Costumer("Nicolai", "Rosendahl", "MrJustMe"));
        costumer.add(new Costumer("Helena", "Rosendahl", "Ballademageren"));
        costumer.add(new Costumer("Luna", "Rosendahl", "Prinsessen"));
        costumer.add(new Costumer("Simon", "Jørgensen", "qRonkz"));
        costumer.add(new Costumer("Mikkel", "Enoch", "EnochGaming"));
        costumer.add(new Costumer("Michael", "Skarnes", "Skarn"));
        printCostumers();
    }

    private static void printCostumers(){
        for(Costumer c: costumer){
            System.out.println(c);
        }
    }

}
