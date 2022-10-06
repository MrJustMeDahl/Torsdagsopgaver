package Task2;

import java.util.ArrayList;

public class Building {

    private final ArrayList<Room> Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.Rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }

    public int countLamps(){
        int totalAmountOfLamps = 0;
        for(int i = 0; i < Rooms.size(); i++){
            int numberOfLamps = Rooms.get(i).getNumberOfLamps();
            totalAmountOfLamps += numberOfLamps;
        }
        return totalAmountOfLamps;
    }
}
