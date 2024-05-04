public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account bob = new Account("Bob's account", 100.00);
        
        bob.deposit(20);
        
        System.out.println(bob);
    }
}