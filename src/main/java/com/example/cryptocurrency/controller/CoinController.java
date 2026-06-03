package com.example.cryptocurrency.controller;

import com.example.cryptocurrency.model.Coin;
import com.example.cryptocurrency.service.CoinService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coins")
public class CoinController {
    private final CoinService coinService;

    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @GetMapping
    public ResponseEntity<List<Coin>> getCoins() {
        // Endpoint ini dipanggil oleh JavaScript frontend
        // untuk mendapatkan daftar coin dari backend Java.
        return ResponseEntity.ok(coinService.fetchCoins());
    }
}
