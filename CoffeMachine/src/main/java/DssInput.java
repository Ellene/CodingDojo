
public class DssInput {

    public boolean isHot() {
        return hot;
    }

    private final boolean hot;

    public int getAmount() {
        return amount;
    }

    private final int amount;

    public enum Drink {


        TEA(40), COFFEE(60) ,CHOCOLATE(50), ORANGE_JUICE(60);

        public int getPrice() {
            return price;
        }

        private int price;

        Drink(int price) {
            this.price = price;
        }
    }

    public Drink drink;
    public int numberOfSugar;

    public DssInput(Drink drink, int numberOfSugar, int amount, boolean b) {
        this.drink = drink;
        this.numberOfSugar = numberOfSugar;
        this.amount = amount;
        this.hot = b;
    }
}
