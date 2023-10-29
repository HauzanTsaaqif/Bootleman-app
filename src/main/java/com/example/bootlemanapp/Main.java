package com.example.bootlemanapp;

public class Main {
    public static void main(String[] args) {
         User akunTerdaftar = new User();
               
        // Panggil metode akunBaru() untuk membuat akun
        akunTerdaftar.akunBaru();

        // Tampilkan jumlah akun yang telah dibuat
        System.out.println("Jumlah akun yang telah dibuat: " + User.getJumlahUser());

         // login akun
       
       akunTerdaftar.loginAkun();
        
        // User akunYangDihapus = akunTerdaftar.daftarAkun.get(0); // Gantilah dengan indeks yang sesuai
        // akunTerdaftar.hapusAkun(akunYangDihapus);
        // akunTerdaftar.loginAkun();

         // Menampilkan informasi tentang tempat sampah kedua
       
    }
}
