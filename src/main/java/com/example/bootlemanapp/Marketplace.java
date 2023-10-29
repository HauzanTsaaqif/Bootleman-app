package com.example.bootlemanapp;

import java.util.ArrayList;

public class Marketplace {
    ArrayList<Postingan> daftarPostingan;

    public Marketplace() {
        this.daftarPostingan = new ArrayList<>();
    }

    public void tambahPostingan(Postingan postingan) {
        daftarPostingan.add(postingan);
    }

    public void tampilkanPostingan() {
        System.out.println("Daftar Postingan:");
        for (int i = 0; i < daftarPostingan.size(); i++) {
            Postingan postingan = daftarPostingan.get(i);
            System.out.println(i + ". " + postingan.judul + " - " + postingan.deskripsi + " | Harga: " + postingan.hargaRupiah + " | Stok: " + postingan.stok);
        }
    }

    public void editPostingan(int indeks, String judul, String deskripsi, int hargaRupiah, int stok) {
        Postingan postingan = daftarPostingan.get(indeks);
        postingan.judul = judul;
        postingan.deskripsi = deskripsi;
        postingan.hargaRupiah = hargaRupiah;
        postingan.stok = stok;
    }

    public void hapusPostingan(int indeks) {
        daftarPostingan.remove(indeks);
    }
}
