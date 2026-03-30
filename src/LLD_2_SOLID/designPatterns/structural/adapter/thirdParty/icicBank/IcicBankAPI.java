package LLD_2_SOLID.designPatterns.structural.adapter.thirdParty.icicBank;

public class IcicBankAPI {

    public void transferMoney(String sourceAccount, String destinationAccount, double amount) {
        System.out.println("Transferring " + amount + " from " + sourceAccount + " to " + destinationAccount + " using ICIC Bank API.");
    }
}
