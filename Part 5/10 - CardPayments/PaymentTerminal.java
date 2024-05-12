public class PaymentTerminal {
    
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        }
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }
    
    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            affordableMeals++;
            this.money += 2.5;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            heartyMeals++;
            this.money += 4.3;
            return payment - 4.3;
        }
        return payment;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}