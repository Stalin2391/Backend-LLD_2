package LLD_2_SOLID.designPatterns.structural.adapter;

public interface BankAPI {
    public void sendMoney(String fromAccount, String toAccount, double amount);
}
