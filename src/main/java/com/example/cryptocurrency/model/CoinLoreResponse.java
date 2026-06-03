package com.example.cryptocurrency.model;

import java.util.List;

public class CoinLoreResponse {
    private List<Coin> data;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }
}
