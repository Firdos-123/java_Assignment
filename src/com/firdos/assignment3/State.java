package com.firdos.assignment3;

public class State extends Country {
    public State(String name, String language, String currency, String capital) {
        super(name, language, currency, capital);
    }

    @Override
    public String toString() {
        return "State: " + getName() + ", Language: " + getLanguage() + ", Currency: " + getCurrency() + ", Capital: " + getCapital();
    }
}
