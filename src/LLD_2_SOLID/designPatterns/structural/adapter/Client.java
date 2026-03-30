package LLD_2_SOLID.designPatterns.structural.adapter;

public class Client {
//    public static BankAPI bank = new YesBankAdapter();
    public static BankAPI bank = new IciciBankAdapter();
    public static void main(String[] args) {
        bank.sendMoney("1234567890", "0987654321", 1000);
    }
}
