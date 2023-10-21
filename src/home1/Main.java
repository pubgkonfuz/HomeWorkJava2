package home1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        double withdrawAmount = 6000;
        while (true) {
            try {
                bankAccount.setWithDraw((int) withdrawAmount);
                System.out.println("Withdrawn " + withdrawAmount + " som");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Вывод счёта " + remainingAmount + " som" + "\n" +
                        " больше нет денег ");
                break;
            }
        }
    }
}





