package com.example.cryptocurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptocurrencyApplication {
    // File utama untuk presentasi: menjalankan aplikasi web Java,
    // lalu backend akan mengambil data Coinlore agar tampil di halaman browser.
    public static void main(String[] args) {
        SpringApplication.run(CryptocurrencyApplication.class, args);
    }
}
