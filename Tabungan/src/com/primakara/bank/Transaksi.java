//package com.primakara.bank;
//
//public class Transaksi {
//    // Private attribute
//    private String idTransaksi;       // ID unik transaksi berupa angka
//    private String noRekening;        // No Rekening dengan 8 digit
//    private String jenisTransaksi;    // "Setoran" atau "Penarikan"
//    private double nominalTransaksi;  // Nominal harus > 0
//    private double saldo;             // Saldo akhir setelah transaksi
//
//    // Constructor
//    public Transaksi(String idTransaksi, String noRekening, String jenisTransaksi,
//                     double nominalTransaksi, double saldo) {
//        if (!idTransaksi.matches("\\d+")) {
//            throw new IllegalArgumentException("ID Transaksi harus berupa angka.");
//        }
//        if (noRekening.length() != 8 || !noRekening.matches("\\d+")) {
//            throw new IllegalArgumentException("No Rekening harus berupa 8 digit angka.");
//        }
//        if (!jenisTransaksi.equals("Setoran") && !jenisTransaksi.equals("Penarikan")) {
//            throw new IllegalArgumentException("Jenis Transaksi harus 'Setoran' atau 'Penarikan'.");
//        }
//        if (nominalTransaksi <= 0) {
//            throw new IllegalArgumentException("Nominal Transaksi harus lebih besar dari 0.");
//        }
//        if (saldo <= 0) {
//            throw new IllegalArgumentException("Saldo harus lebih besar dari 0.");
//        }
//
//        this.idTransaksi = idTransaksi;
//        this.noRekening = noRekening;
//        this.jenisTransaksi = jenisTransaksi;
//        this.nominalTransaksi = nominalTransaksi;
//        this.saldo = saldo;
//    }
//
//    // Getters
//    public String getIdTransaksi() {
//        return idTransaksi;
//    }
//
//    public String getNoRekening() {
//        return noRekening;
//    }
//
//    public String getJenisTransaksi() {
//        return jenisTransaksi;
//    }
//
//    public double getNominalTransaksi() {
//        return nominalTransaksi;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }
//}



//version1.2

package com.primakara.bank;

public class Transaksi {
    // Private attributes
    private String idTransaksi;       // ID unik transaksi berupa angka
    private String noRekening;        // No Rekening dengan 8 digit
    private String jenisTransaksi;    // Jenis Transaksi: "Setoran" atau "Penarikan"
    private double nominalTransaksi;  // Nominal transaksi harus lebih dari 0
    private double saldo;             // Saldo akhir setelah transaksi, minimal 50.000

    // Constructor
    public Transaksi(String idTransaksi, String noRekening, String jenisTransaksi,
                     double nominalTransaksi, double saldo) {
        // Validasi ID Transaksi (harus angka)
        if (!idTransaksi.matches("\\d+")) {
            throw new IllegalArgumentException("ID Transaksi harus berupa angka.");
        }

        // Validasi No Rekening (8 digit angka)
        if (noRekening.length() != 8 || !noRekening.matches("\\d+")) {
            throw new IllegalArgumentException("No Rekening harus berupa 8 digit angka.");
        }

        // Validasi jenis transaksi (Setoran atau Penarikan)
        if (!jenisTransaksi.equals("Setoran") && !jenisTransaksi.equals("Penarikan")) {
            throw new IllegalArgumentException("Jenis Transaksi harus 'Setoran' atau 'Penarikan'.");
        }

        // Validasi nominal transaksi (lebih dari 0)
        if (nominalTransaksi <= 0) {
            throw new IllegalArgumentException("Nominal Transaksi harus lebih besar dari 0.");
        }

        // Validasi saldo awal (minimal 50.000)
        if (saldo < 50000) {
            throw new IllegalArgumentException("Saldo harus minimal 50.000.");
        }

        // Inisialisasi atribut
        this.idTransaksi = idTransaksi;
        this.noRekening = noRekening;
        this.jenisTransaksi = jenisTransaksi;
        this.nominalTransaksi = nominalTransaksi;
        this.saldo = saldo;
    }

    // Getters
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getJenisTransaksi() {
        return jenisTransaksi;
    }

    public double getNominalTransaksi() {
        return nominalTransaksi;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter untuk saldo dengan validasi minimal 50.000
    public void setSaldo(double saldo) {
        if (saldo < 50000) {
            throw new IllegalArgumentException("Saldo harus minimal 50.000.");
        }
        this.saldo = saldo;
    }

    // Method untuk menambah setoran
    public void tambahSetoran(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Nominal setoran harus lebih dari 0.");
        }
        this.saldo += jumlah; // Tambahkan jumlah ke saldo
        System.out.println("Setoran berhasil. Saldo saat ini: " + this.saldo);
    }

    // Method untuk penarikan dengan validasi saldo akhir minimal 50.000
    public void tarikUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Nominal penarikan harus lebih dari 0.");
        }
        if (this.saldo - jumlah < 50000) {
            throw new IllegalArgumentException("Saldo setelah penarikan harus minimal 50.000.");
        }
        this.saldo -= jumlah; // Kurangi saldo
        System.out.println("Penarikan berhasil. Saldo saat ini: " + this.saldo);
    }

    // Method private untuk validasi saldo akhir
    private void validasiSaldoAkhir() {
        if (this.saldo < 50000) {
            throw new IllegalArgumentException("Saldo akhir tidak boleh kurang dari 50.000.");
        }
    }
}
