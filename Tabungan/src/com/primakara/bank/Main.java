package com.primakara.bank;

//Kadek Bagastya Adi Widyadhana		(2301010075)
//I Gede Suryaatmaja                (2301010068)


////TESTING TRANSAKSI         ////
//public class Main {
//    public static void main(String[] args) {
//        try {
//            // Membuat objek Transaksi dengan data valid
//            Transaksi transaksi1 = new Transaksi(
//                    "123456", // ID Transaksi
//                    "12345678", // No Rekening
//                    "Setoran", // Jenis Transaksi
//                    100000, // Nominal Transaksi
//                    100000 // Saldo awal
//            );
//
//            // Menampilkan data transaksi awal
//            System.out.println("ID Transaksi: " + transaksi1.getIdTransaksi());
//            System.out.println("No Rekening: " + transaksi1.getNoRekening());
//            System.out.println("Jenis Transaksi: " + transaksi1.getJenisTransaksi());
//            System.out.println("Nominal Transaksi: " + transaksi1.getNominalTransaksi());
//            System.out.println("Saldo: " + transaksi1.getSaldo());
//
//            // Melakukan setoran
//            System.out.println("\nMenambahkan setoran sebesar 50.000...");
//            transaksi1.tambahSetoran(50000);
//
//            // Melakukan penarikan dengan validasi saldo minimal 50.000
//            System.out.println("\nMelakukan penarikan sebesar 80.000...");
//            transaksi1.tarikUang(80000);
//
//            // Coba penarikan yang tidak valid (akan memunculkan exception)
//            System.out.println("\nMelakukan penarikan sebesar 80.000 lagi...");
//            transaksi1.tarikUang(80000); // Ini akan gagal karena saldo tidak cukup
//
//        } catch (IllegalArgumentException e) {
//            // Menangkap error jika ada validasi yang gagal
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}


//              //  TESTING TABUNGAN  ////////
 public class Main {
    public static void main(String[] args) {
        Nasabah testNasabah = new Nasabah(
                "000191",
                "12345678901111111",
                "Ucup",
                "081111111");

        testNasabah.setAlamat("Denpasar");
        testNasabah.setNamaIbuKandung("Dewi");
        testNasabah.setPekerjaan("Guru");
        testNasabah.setPenghasilanRataRataSebulan("10000");
        System.out.println(testNasabah.getKodeCIF());
        System.out.println(testNasabah.getNIK());
        System.out.println(testNasabah.getNamaNasabah());
        System.out.println(testNasabah.getAlamat());
        System.out.println(testNasabah.getTelp());
        System.out.println(testNasabah.getNamaIbuKandung());
        System.out.println(testNasabah.getPekerjaan());
        System.out.println(testNasabah.getPenghasilanRataRataSebulan());
        testNasabah.viewPesanError();

    }
}


