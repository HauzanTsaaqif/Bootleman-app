package com.example.bootlemanapp;

public class TempatSampah {
    private int maxPermen;
    private int maxBotol;
    private int[] daftarPermen;
    private int[] daftarBotol;
    private int jumlahPermen;
    private int jumlahBotol;

    public TempatSampah(int maxPermen, int maxBotol) {
        this.maxPermen = maxPermen;
        this.maxBotol = maxBotol;
        daftarPermen = new int[maxPermen];
        daftarBotol = new int[maxBotol];
    }

    public void TambahPermen(int index, int jumlahPermen) {
        if (jumlahPermen < maxPermen) {
            daftarPermen[index] = jumlahPermen;
        } else {
            System.out.println("Tempat sampah permen penuh.");
        }
    }

    public void ShowJumlahPermen(int index) {
        if (maxPermen > 0) {
            double persen = (double) daftarPermen[index] / maxPermen * 100;
            System.out.println(persen + "%");
        }
        System.out.println("Ada permen: " + daftarPermen[index]);
    }

    public void TambahBotol(int index, int jumlahBotol) {
        if (jumlahBotol < maxBotol) {
            daftarBotol[index] = jumlahBotol;
           
        } else {
            System.out.println("Tempat sampah botol penuh.");
        }
    }

    public void ShowKapasitasBotol(int index) {
        if (maxBotol > 0) {
            double persen = (double) daftarBotol[index] / maxBotol * 100;
            System.out.println(persen + "%");
        }
        System.out.println("Ada botol: " + daftarBotol[index]);
    }
}
