package Task2;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Room> collectedRooms = new ArrayList<>();

    public static void main(String[] args) {
        Room room1 = new Room(2, 4, 3);
        Room room2 = new Room(3, 9, 20);
        Room room3 = new Room(1,10,1);
        collectedRooms.add(room1);
        collectedRooms.add(room2);
        collectedRooms.add(room3);
        Building CPHBusiness = new Building(collectedRooms, 4, 2, false);
        System.out.println(countLampsInBuilding(CPHBusiness));
        isNormal(CPHBusiness);
    }

    private static int countLampsInBuilding(Building building){

        return building.countLamps();
    }

    private static boolean isNormal(Building building){
        int floors = building.getNumberOfFloors();
        int numberOfRooms = collectedRooms.size();
        if(floors > numberOfRooms){
            System.out.println("This is an odd building.");
            return false;
        } else {
            return true;
        }
    }

}
