package Encapsulation.Account;

public class Account {
    private long account_Number;
    private String name;
    private String email;
    private float amount;

    public Account(long account_Number, String name, String email, float amount) {
        this.account_Number = account_Number;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public long getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(long account_Number) {
        this.account_Number = account_Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void print(){
        System.out.println(getAccount_Number()+" "+getName()+" "+getEmail()+" "+getAmount());
    }
}
