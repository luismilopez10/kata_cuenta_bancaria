package com.bank.kata_cuenta_bancaria;

import com.bank.kata_cuenta_bancaria.values.AmountOf;
import com.bank.kata_cuenta_bancaria.values.Date;

public class Account {
    private Statement statement;

    public Account(Statement statement){
        this.statement = statement;
    }

    void deposit(AmountOf amountOf, Date date){
        statement.newTransaction(amountOf, date);
    }

    void withdraw(AmountOf amountOf, Date date){
        statement.newTransaction(amountOf, date);
    }

    void printStatemnts(){
        this.statement.transactions.stream().forEach( transaction ->
        {
            System.out.print(transaction.date.value() + " ");
            System.out.print(transaction.amountOf.value() + " ");
            System.out.println(transaction.balance.value());
        });
    }
}
