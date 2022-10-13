import java.util.ArrayList;

public class Board {

    private Field[] fields = new Field[40];
    public static ArrayList<ChanceKort> chanceCards = new ArrayList<>();
    public static int index = 0;
    /*
    * TODO:
    *   - udvid konstruktoren (jvf. Task 2.d)
    *   - tilføj statiske felter (jvf. Task 2.e, 2.f)
    *   - tilføj statisk metode (jvf. Task 2.g)
    *
    * */

    Board(String[] fielddata, String[] chanceData){

        createFields(fielddata);
        createChanceKort(chanceData);

    }

    public static ChanceKort getChanceCard(){
        ChanceKort currentCard = chanceCards.get(index);
        index++;
        if(index > chanceCards.size()){
            index = 0;
        }
        return currentCard;
    }

    private void createChanceKort(String[] chanceData) {
        for(int i = 0; i < chanceCards.size(); i++){
            String s = chanceData[i];
            String[] values = s.split(",");

            String cardText = values[0];
            int cardCost = Integer.parseInt(values[1]);
            int cardIncome = Integer.parseInt(values[2]);

            ChanceKort c = new ChanceKort(cardText, cardCost, cardIncome);

            chanceCards.add(c);
        }
    }

    private Field[] createFields(String[] data){
        for(int i = 0; i < fields.length; i++){
            String s = data[i];
            String[] values = s.split(",");

            int id =  Integer.parseInt(values[0]);
            String fieldtype = values[1];
            String label = values[2];
            int cost = Integer.parseInt(values[3]);
            int income = Integer.parseInt(values[4]);
            int seriesID = Integer.parseInt(values[5]);

            Field f = null;


            switch (fieldtype) {
                case "plot": f = new Plot(id, label, cost, income, seriesID);
                break;
                case "rederi":
                case "brewery": f = new Business(id, label, cost, income, seriesID);
                    break;
                case "jail": f = new Jail(id, label, cost);
                       break;
                case "visit": f = new Visit(id, label);
                    break;
                case "parking": f = new Parking(id, label);
                    break;
                case "start": f = new Start(id, label, cost, income);
                    break;
                case "lykkefelt": f = new Chance(id, label, cost, income);
                    break;
                case "tax": f = new Tax(id, label,cost, income);
                    break;

              //  default: f = new Field(id, label, cost, income);
            }

            fields[i] = f;

        }
        return fields;
    }
    public Field getField(int id) {
        id--;
        if (id < 0 || id >= fields.length) {
            return null;
        }
        return fields[id];
    }


}