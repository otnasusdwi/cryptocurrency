const API_URL = "/api/coins";
const coinList = document.getElementById("coinList");
const refreshButton = document.getElementById("refreshButton");
const statusText = document.getElementById("statusText");

// File utama untuk presentasi: mengambil data cryptocurrency dari backend Java,
// lalu menampilkan rank, name, symbol, dan price_usd dalam tampilan mobile.
async function fetchCoins() {
  statusText.textContent = "Memuat data cryptocurrency...";
  statusText.classList.remove("is-hidden");
  refreshButton.disabled = true;

  try {
    const response = await fetch(API_URL);

    if (!response.ok) {
      throw new Error("Gagal mengambil data dari server");
    }

    const coins = await response.json();
    renderCoins(coins);
    statusText.textContent = "Data berhasil diperbarui.";
  } catch (error) {
    coinList.innerHTML = "";
    statusText.textContent = "Gagal mengambil data cryptocurrency. Coba lagi.";
  } finally {
    refreshButton.disabled = false;
  }
}

function renderCoins(coins) {
  coinList.innerHTML = "";

  if (!coins.length) {
    statusText.textContent = "Data tidak tersedia saat ini.";
    return;
  }

  coins.forEach((coin) => {
    const card = document.createElement("article");
    card.className = "coin-card";
    card.innerHTML = `
      <div>
        <span class="meta-label">Rank</span>
        <span class="rank-number">${coin.rank}</span>
      </div>
      <div>
        <span class="coin-name">${coin.name}</span>
        <span class="coin-symbol">${coin.symbol}</span>
      </div>
      <div>
        <span class="meta-label">USD</span>
        <span class="coin-price">${coin.priceUsd}</span>
      </div>
    `;

    coinList.appendChild(card);
  });
}

refreshButton.addEventListener("click", fetchCoins);
fetchCoins();
