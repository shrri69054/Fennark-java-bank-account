public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        System.out.println("Initial balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("After depositing 500: " + acc.getBalance());

        try {
            acc.withdraw(300);
            System.out.println("After withdrawing 300: " + acc.getBalance());

            System.out.println("Trying to withdraw 5000...");
            acc.withdraw(5000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            acc.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final balance: " + acc.getBalance());
    }
}
