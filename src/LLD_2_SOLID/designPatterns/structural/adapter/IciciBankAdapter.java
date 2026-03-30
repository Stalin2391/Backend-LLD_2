package LLD_2_SOLID.designPatterns.structural.adapter;

import LLD_2_SOLID.designPatterns.structural.adapter.thirdParty.icicBank.IcicBankAPI;

public class IciciBankAdapter implements BankAPI {
    private IcicBankAPI icicBankAPI;


    @Override
    public void sendMoney(String fromAccount, String toAccount, double amount) {
        if(icicBankAPI == null){
            icicBankAPI = new IcicBankAPI();
        }
        icicBankAPI.transferMoney(fromAccount, toAccount, amount);
    }
}
