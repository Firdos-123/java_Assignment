package com.firdos.assignment3;

public class Country extends Continent {
    private String language;
    private String currency;
    private String capital;

    public Country(String name, String language, String currency, String capital) {
        super(name);
        this.language = language;
        this.currency = currency;
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "Country: " + getName() + ", Language: " + language + ", Currency: " + currency + ", Capital: " + capital;
    }
}
