package LLD_2_SOLID.designPatterns.structural.adapter;

import LLD_2_SOLID.designPatterns.structural.adapter.thirdParty.yesBank.YesBankAPI;

public class YesBankAdapter implements BankAPI{
    private YesBankAPI yesBankAPI;

    @Override
    public void sendMoney(String fromAccount, String toAccount, double amount) {
        if(yesBankAPI == null) {
            yesBankAPI = new YesBankAPI();
        }
        yesBankAPI.sendMoney(fromAccount, toAccount, amount);
    }
}
