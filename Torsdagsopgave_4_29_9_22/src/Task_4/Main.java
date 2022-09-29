package Task_4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4 End game");

        Menu playerMenu = new Menu(actions);
        int input = Integer.parseInt(playerMenu.showMenu());
        doAction(input);
    }

    public static void doAction(int input){
        switch(input){
            case 1:
                System.out.println("Starting your game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("The input you have entered is not valid");
        }
    }

}
