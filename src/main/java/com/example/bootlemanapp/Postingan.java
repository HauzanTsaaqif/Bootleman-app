package com.example.bootlemanapp;

public class Postingan {
    String judul;
    String deskripsi;
    int hargaRupiah;
    int stok;

    public Postingan(String judul, String deskripsi, int hargaRupiah, int stok) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.hargaRupiah = hargaRupiah;
        this.stok = stok;
    }

    public void beli(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Pembelian sukses. Terima kasih telah berbelanja!");
        } else {
            System.out.println("Maaf, stok tidak mencukupi.");
        }
    }
}
