package com.example.bootlemanapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Dashboard {
    private ArrayList<TempatSampah> tempatSampahList = new ArrayList<>();

    public Dashboard() {
    }

    public void  show(){
        Marketplace marketplace = new Marketplace();
        Scanner scanner = new Scanner(System.in);

        // Tambahkan beberapa postingan awal
        marketplace.tambahPostingan(new Postingan("Botol Bekas A", "Deskripsi A", 5000, 10));
        marketplace.tambahPostingan(new Postingan("Botol Bekas B", "Deskripsi B", 7000, 5));

        while (true) {
            System.out.println("Selamat datang di Marketplace Botol Bekas:");
            marketplace.tampilkanPostingan();

            System.out.println("Menu:");
            System.out.println("1. Tambah Postingan");
            System.out.println("2. Edit Postingan");
            System.out.println("3. Hapus Postingan");
            System.out.println("4. Beli Botol Bekas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    judul = scanner.nextLine(); // Menggunakan nextLine() untuk judul
                    System.out.print("Deskripsi: ");
                    String deskripsi = scanner.nextLine();
                    System.out.print("Harga (Rp): ");
                    int hargaRupiah = scanner.nextInt();
                    System.out.print("Stok: ");
                    int stok = scanner.nextInt();
                    Postingan postinganBaru = new Postingan(judul, deskripsi, hargaRupiah, stok);
                    marketplace.tambahPostingan(postinganBaru);
                    System.out.println("Postingan berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Pilih indeks postingan yang akan diedit: ");
                    int indeksEdit = scanner.nextInt();
                    if (indeksEdit >= 0 && indeksEdit < marketplace.daftarPostingan.size()) {
                        System.out.print("Judul baru: ");
                        judul = scanner.nextLine();
                        judul = scanner.nextLine();
                        System.out.print("Deskripsi baru: ");
                        deskripsi = scanner.nextLine();
                        System.out.print("Harga baru (Rp): ");
                        hargaRupiah = scanner.nextInt();
                        System.out.print("Stok baru: ");
                        stok = scanner.nextInt();
                        marketplace.editPostingan(indeksEdit, judul, deskripsi, hargaRupiah, stok);
                        System.out.println("Postingan berhasil diedit.");
                    } else {
                        System.out.println("Indeks postingan tidak valid.");
                    }
                    break;
                case 3:
                    System.out.print("Pilih indeks postingan yang akan dihapus: ");
                    int indeksHapus = scanner.nextInt();
                    if (indeksHapus >= 0 && indeksHapus < marketplace.daftarPostingan.size()) {
                        marketplace.hapusPostingan(indeksHapus);
                        System.out.println("Postingan berhasil dihapus.");
                    } else {
                        System.out.println("Indeks postingan tidak valid.");
                    }
                    break;
                case 4:
                    marketplace.tampilkanPostingan();
                    System.out.print("Pilih indeks postingan yang akan dibeli: ");
                    int indeksBeli = scanner.nextInt();
                    if (indeksBeli >= 0 && indeksBeli < marketplace.daftarPostingan.size()) {
                        System.out.print("Jumlah yang akan dibeli: ");
                        int jumlahBeli = scanner.nextInt();
                        marketplace.daftarPostingan.get(indeksBeli).beli(jumlahBeli);
                    } else {
                        System.out.println("Indeks postingan tidak valid.");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void TambahTempatSampah(int maxPermen, int maxBotol) {
        TempatSampah tempatsampah = new TempatSampah(maxPermen, maxBotol);
        tempatSampahList.add(tempatsampah);
       }

    public void TambahPermen(int tempatsampahIndex, int permen) {
        if (tempatsampahIndex >= 0 && tempatsampahIndex < tempatSampahList.size()) {
            TempatSampah tempatsampah = tempatSampahList.get(tempatsampahIndex);
            tempatsampah.TambahPermen(tempatsampahIndex, permen);
        } else {
            System.out.println("Tempat Sampah tidak ditemukan.");
        }
    }

    public void TambahBotol(int tempatsampahIndex, int botol) {
        if (tempatsampahIndex >= 0 && tempatsampahIndex < tempatSampahList.size()) {
            TempatSampah tempatsampah = tempatSampahList.get(tempatsampahIndex);
            tempatsampah.TambahBotol(tempatsampahIndex, botol);
        } else {
            System.out.println("Tempat Sampah tidak ditemukan.");
        }
    }

    public void ShowTempatSampah(int tempatsampahIndex) {
        if (tempatsampahIndex >= 0 && tempatsampahIndex < tempatSampahList.size()) {
            TempatSampah tempatsampah = tempatSampahList.get(tempatsampahIndex);
            System.out.println("Tempat Sampah " + tempatsampahIndex + ":");
            tempatsampah.ShowJumlahPermen(tempatsampahIndex);
            tempatsampah.ShowKapasitasBotol(tempatsampahIndex);
        } else {
            System.out.println("Tempat Sampah tidak ditemukan.");
        }
    }
}
