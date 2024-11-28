package com.primakara.bank;

//Kadek Bagastya Adi Widyadhana		(2301010075)
//I Gede Suryaatmaja                (2301010068)

public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek Nasabah
        Nasabah testNasabah = new Nasabah("CIF12", "1234567890","telor");

        // Buat Rekening
        Tabungan rekening1 = new Tabungan("12345678", 1000000, 1000000);
        Tabungan rekening2 = new Tabungan("02222222", 1000000, 1000000);
        Tabungan rekening3 = new Tabungan("02222222", 1000000, 1000000);
        Tabungan rekening4 = new Tabungan("02222222", 1000000, 1000000);
        testNasabah.addTabungan(rekening1);
        testNasabah.addTabungan(rekening2);
        testNasabah.addTabungan(rekening3);
        testNasabah.addTabungan(rekening4);

        // Info Nasabah
        System.out.println("CIF  : " + testNasabah.getKodeCIF());
        System.out.println("NIK  : " + testNasabah.getNIK());
        System.out.println("Nama : " + testNasabah.getNamaNasabah());
        System.out.println("Jumlah Rekening : " + testNasabah.getJmlTabungan());
        System.out.println("Daftar Rekening : ");
        for (int i = 0; i < testNasabah.getJmlTabungan(); i++) {
            System.out.println(testNasabah.getListTabungan()[i].getNoRekening());


        }
    }
}
