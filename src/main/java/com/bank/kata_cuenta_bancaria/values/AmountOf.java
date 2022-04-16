package com.bank.kata_cuenta_bancaria.values;

import java.util.Objects;

public class AmountOf {
    private final int amountOf;

    public AmountOf(int amountOf) {
        this.amountOf = Objects.requireNonNull(amountOf);
    }

    public int value(){
        return amountOf;
    }
}
