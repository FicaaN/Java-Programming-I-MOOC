public class MainProgram {

    public static void main(String[] args) {
        
        PaymentCard PaulCard = new PaymentCard(20.0);
        PaymentCard MattCard = new PaymentCard(30.0);
        
        PaulCard.eatHeartily();
        MattCard.eatAffordably();
        
        System.out.println("Paul: The card has a balance of " + PaulCard);
        System.out.println("Matt: The card has a balance of " + MattCard);
        
        PaulCard.addMoney(20.0);
        MattCard.eatHeartily();
        
        System.out.println("Paul: The card has a balance of " + PaulCard);
        System.out.println("Matt: The card has a balance of " + MattCard);
        
        PaulCard.eatAffordably();
        PaulCard.eatAffordably();
        MattCard.addMoney(50.0);
        
        System.out.println("Paul: The card has a balance of " + PaulCard);
        System.out.println("Matt: The card has a balance of " + MattCard);
    }
}