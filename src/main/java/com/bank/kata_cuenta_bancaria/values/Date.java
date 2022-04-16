package com.bank.kata_cuenta_bancaria.values;

import java.text.SimpleDateFormat;
import java.util.Objects;

public class Date {
    private final String date;

    public Date(String date) {
        this.date = Objects.requireNonNull(date);
        if (date.isBlank()){
            throw new IllegalArgumentException("La fecha no puede estar vacía");
        }
    }

    public String value(){
        return date;
    }
}
