package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {
    private long card;
    private int balance;
    private long oldCard;


    public BankAccount(long i) {
//        this.card  = oldCard + 1;
        oldCard = this.card;
        this.card = i;
        balance = 20;

    }


    public long getCard() {
        return card;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}