# Cryptocurrency Web App with Java

Aplikasi web berbasis Java Spring Boot untuk menampilkan data cryptocurrency dari API online:

`https://api.coinlore.net/api/tickers/`

Field yang ditampilkan:

- `rank`
- `name`
- `symbol`
- `price_usd`

## Teknologi

- Java 21
- Spring Boot
- HTML
- CSS
- JavaScript

## Fitur

- Tombol `Refresh` untuk mengambil data terbaru
- Tampilan mobile mirip contoh layar
- Backend Java mengambil data dari API Coinlore
- Frontend menampilkan data dari endpoint lokal Spring Boot

## Struktur Penting

- `pom.xml`
- `src/main/java/com/example/cryptocurrency/CryptocurrencyApplication.java`
- `src/main/java/com/example/cryptocurrency/controller/CoinController.java`
- `src/main/java/com/example/cryptocurrency/service/CoinService.java`
- `src/main/resources/static/index.html`
- `src/main/resources/static/styles.css`
- `src/main/resources/static/main.js`

## Cara Menjalankan

1. Pastikan Java dan Maven sudah terpasang.
2. Jalankan perintah berikut di folder proyek:

```bash
mvn spring-boot:run
```

3. Buka browser di alamat:

```text
http://localhost:8080
```

## Endpoint Lokal

Aplikasi ini menyediakan endpoint Java lokal:

```text
http://localhost:8080/api/coins
```

## Catatan

Komentar untuk tujuan presentasi sudah ditambahkan di file utama Java dan file utama JavaScript.
