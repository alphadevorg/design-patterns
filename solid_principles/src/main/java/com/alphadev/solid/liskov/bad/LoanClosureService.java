package com.alphadev.solid.liskov.bad;

/*
* we are unable to substitute subtype with super type, that is violation of
* Liskov substituation rule.
* Solution to this lets segregate the method in different super types
* and make supertype substitutable at any given time.
* */
public class LoanClosureService {
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();
    }
}
