package com.bank.kata_cuenta_bancaria;

import com.bank.kata_cuenta_bancaria.values.AmountOf;
import com.bank.kata_cuenta_bancaria.values.Date;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(new AmountOf(1000), new Date("10/01/2021"));
        account.deposit(new AmountOf(1500), new Date("10/01/2021"));
        account.withdraw(new AmountOf(-2000), new Date("10/01/2021"));

        account.printStatemnts();
    }
}
