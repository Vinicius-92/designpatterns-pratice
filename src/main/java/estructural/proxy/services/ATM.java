package estructural.proxy.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ATM implements BankOperations {
    private final BankOperations bank;

    @Override
    public void deposit(Long account, Long amount) {
        System.out.println("ATM proxy sending request to bank");
        bank.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String passwd, Long amount) {
        if(amount > 300) {
            System.out.println("You may not withdraw amounts over 300 here");
            return;
        }
        System.out.println("ATM proxy sending request to bank");
        bank.withdraw(account, passwd, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("You must go to the bank to perform this operation");
    }
}
