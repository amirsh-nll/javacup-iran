

public class Customer {

    private String name;
    private Account account;
    private CreditCard creditCard;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calCustomerBalance() {
        return account.getBalance() + creditCard.getCredit();
    }
}
