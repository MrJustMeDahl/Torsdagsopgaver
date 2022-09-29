package Task_6;

public class Main {

    public static void main(String[] args){
        Cafe CPHBusiness = new Cafe();

        CPHBusiness.loadMenuData();
        System.out.println(CPHBusiness.getCoffeeMenu());
    }
}
