package com.example.cryptocurrency.service;

import com.example.cryptocurrency.model.Coin;
import com.example.cryptocurrency.model.CoinLoreResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class CoinService {
    private static final String COINLORE_URL = "https://api.coinlore.net/api/tickers/";

    private final RestTemplate restTemplate;

    public CoinService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Coin> fetchCoins() {
        // Mengambil data cryptocurrency dari API Coinlore
        // lalu mengubah respons JSON menjadi daftar objek Coin.
        try {
            CoinLoreResponse response = restTemplate.getForObject(COINLORE_URL, CoinLoreResponse.class);
            if (response == null || response.getData() == null) {
                return Collections.emptyList();
            }
            return response.getData();
        } catch (RestClientException exception) {
            return Collections.emptyList();
        }
    }
}
