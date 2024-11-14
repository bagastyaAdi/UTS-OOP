package com.primakara.siska;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan IPK valid
        Mahasiswa mhs1 = new Mahasiswa("Budi", "12345678", 3.5);
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("NIM: " + mhs1.getNIM());
        System.out.println("IPK: " + mhs1.getIPK());

        System.out.println();

        // Membuat objek Mahasiswa dengan IPK tidak valid
        Mahasiswa mhs2 = new Mahasiswa("Siti", "87654321", 4.5);
        System.out.println("Nama: " + mhs2.getNama());
        System.out.println("NIM: " + mhs2.getNIM());
        System.out.println("IPK: " + mhs2.getIPK());

        System.out.println();

        // Mengubah IPK menjadi nilai yang valid
        mhs2.setIPK(3.8);
        System.out.println("Nama: " + mhs2.getNama());
        System.out.println("NIM: " + mhs2.getNIM());
        System.out.println("IPK: " + mhs2.getIPK());

        System.out.println();

        // Mengubah IPK menjadi nilai yang tidak valid
        mhs1.setIPK(-1.0);
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("NIM: " + mhs1.getNIM());
        System.out.println("IPK: " + mhs1.getIPK());
    }
}
