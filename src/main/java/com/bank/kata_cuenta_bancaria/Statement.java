package com.bank.kata_cuenta_bancaria;

import com.bank.kata_cuenta_bancaria.values.AmountOf;
import com.bank.kata_cuenta_bancaria.values.Balance;
import com.bank.kata_cuenta_bancaria.values.Date;

import java.util.*;

public class Statement {

    public List<Transaction> transactions;
    private Balance balance;

    public Statement(){
        this.transactions = new ArrayList<>();
        this.balance = new Balance(2500);
    }

    public void newTransaction(AmountOf amountOf, Date date){
        this.transactions.add(new Transaction(amountOf, date, this.balance));
        this.balance = new Balance(this.balance.value() + amountOf.value());
    }
}
