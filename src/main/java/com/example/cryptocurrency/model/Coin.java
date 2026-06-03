package com.example.cryptocurrency.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Coin {
    private int rank;
    private String name;
    private String symbol;

    // Menerima field "price_usd" dari API Coinlore,
    // lalu mengirimkannya ke frontend sebagai "priceUsd".
    @JsonAlias("price_usd")
    private String priceUsd;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
    }
}
