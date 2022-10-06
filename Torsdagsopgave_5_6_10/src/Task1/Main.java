package Task1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Nicolai", 28);
        Car myCar = new Car("Peugeot", "208 GTI", 2014,"family");
        myCar.setDriver(driver);
        System.out.println(myCar);
        System.out.println(driver);
        Car myNewCar = new Car("Tesla", "Model S", 2022, "Sport");
        myNewCar.setDriver(driver);
        System.out.println(myNewCar);
        System.out.println(driver);
    }
}
