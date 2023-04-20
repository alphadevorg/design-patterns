package com.alphadev.solid.singleresponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setFirstname("Bhaskar");
        account.setAccountNumber(1234);
        account.setTotalAmount(new BigDecimal(100000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123), 123);
    }
}
