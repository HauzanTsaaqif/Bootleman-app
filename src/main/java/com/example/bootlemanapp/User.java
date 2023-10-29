package com.example.bootlemanapp;

import java.util.Scanner;
import java.util.ArrayList;

class User {
    private String username;
    private String usernameBaru;
    private String inputUser;
    private String password;
    private String passwordBaru;
    private String inputPass;
    private static int jumlahUser = 0; 
    boolean loginSukses = false;
    boolean loginGagal = true;
    ArrayList<User> daftarAkun = new ArrayList<>();

    public void setUserName(String namaAkun) {
        this.username = namaAkun;
    }

    public String getUserName() {
        return username;
    }
    
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public  static int getJumlahUser() {
        return jumlahUser;
    }
    
      
   
 
    public void akunBaru() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan username baru atau ketik 'Done' untuk selesai: ");
            String usernameBaru = input.nextLine();

            if (usernameBaru.equals("Done")) {
                break;
            }

            System.out.print("Masukkan password baru: ");
            String passwordBaru = input.nextLine();

            User akun = new User();
            akun.setUserName(usernameBaru);
            akun.setPassword(passwordBaru);
            daftarAkun.add(akun);

            jumlahUser++;
        }
    }
    
     public void loginAkun(){
        Scanner inputAkun = new Scanner(System.in);
        boolean loginSukses = false;

        while (!loginSukses) {
            System.out.print("Masukkan username: ");
            String inputUser = inputAkun.nextLine();

            System.out.print("Masukkan password: ");
            String inputPass = inputAkun.nextLine();

             for (User akun : daftarAkun) {
                if (inputUser.equals(akun.getUserName()) && inputPass.equals(akun.getPassword())) {
                    System.out.println("Login berhasil!");
                    loginSukses = true;
                    break;
                }else{
                    loginGagal = false;
                }
            }

            if (!loginGagal) {
                System.out.println("Login gagal. Coba lagi.");
                loginGagal = true;
            }
        }

         Dashboard dashboard = new Dashboard();

         dashboard.TambahTempatSampah(10, 5); // Menambahkan tempat sampah pertama
         dashboard.TambahTempatSampah(8, 5);  // Menambahkan tempat sampah kedua

         dashboard.TambahPermen(0, 3); // Menambahkan permen ke tempat sampah pertama
         dashboard.TambahPermen(1, 5); // Menambahkan permen ke tempat sampah kedua


         dashboard.TambahBotol(0, 2); // Menambahkan botol ke tempat sampah pertama
         dashboard.TambahBotol(1, 4); // Menambahkan botol ke tempat sampah kedua


         dashboard.ShowTempatSampah(0); // Menampilkan informasi tentang tempat sampah pertama
         dashboard.ShowTempatSampah(1);

         dashboard.show();

    }

 public void hapusAkun(User akunYangAkanDihapus) {
    if (daftarAkun.remove(akunYangAkanDihapus)) {
        jumlahUser--;
        System.out.println("Akun " + akunYangAkanDihapus.getUserName() + " berhasil dihapus.");
    } else {
        System.out.println("Akun tidak ditemukan.");
    }
}


}
