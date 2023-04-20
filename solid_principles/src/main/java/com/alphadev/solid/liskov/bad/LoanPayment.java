package com.alphadev.solid.liskov.bad;

/*
* This loan interface is responsible for payment related operations on loan account
* LoanPayment implemented by actual loan like Home loan, Credit card loan etc.
* For credit card/personal loan which is unsecured foreclosure and repayment is not allowed.
* */
public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}
