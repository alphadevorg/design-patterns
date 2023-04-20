package com.alphadev.solid.dependencyinversion.good;

/*
* As per DIP rule it states :
* High-level modules should not depend on low-level modules. Both should depend on abstractions.
* --- So low level is dependent via CalculateOperation rather being depend on add or substract operation
* Abstraction should not depend on details. Details should depend on abstractions
* --- Abstraction is achieved as via interface we are entering in low level.
* */
public class Calculator {
    public int calculate(int a, int b, CalculatorOperation calculatorOperation) {
        return calculatorOperation.calculate(a, b);
    }
}
