package LLD_2_SOLID.designPatterns.structural.adapter.thirdParty.yesBank;

public class YesBankAPI {

    public void sendMoney(String fromAccount, String toAccount, double amount) {
        System.out.println("Sending " + amount + " from " + fromAccount + " to " + toAccount + " using Yes Bank API.");
    }
}
