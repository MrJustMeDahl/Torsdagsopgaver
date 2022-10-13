public class ChanceKort {

    private String cardText;
    private int cardCost;
    private int cardIncome;

    public ChanceKort(String cardText, int cardCost, int cardIncome){
        this.cardText = cardText;
        this.cardCost = cardCost;
        this.cardIncome = cardIncome;
    }

    public String getCardText() {
        return cardText;
    }

    public int getCardCost() {
        return cardCost;
    }

    public int getCardIncome() {
        return cardIncome;
    }
}
