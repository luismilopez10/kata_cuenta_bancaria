package com.bank.kata_cuenta_bancaria;

import com.bank.kata_cuenta_bancaria.values.Date;
import com.bank.kata_cuenta_bancaria.values.AmountOf;
import com.bank.kata_cuenta_bancaria.values.Balance;

public class Transaction {
    public Date date;
    public AmountOf amountOf;
    public Balance balance;

    public Transaction(AmountOf amountOf, Date date, Balance balance){
        this.amountOf = amountOf;
        this.date = date;
        this.balance = new Balance(balance.value() + amountOf.value());
    }
}
