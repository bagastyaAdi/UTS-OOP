package com.primakara.bank;

public class Tabungan {
    // Private attributes
    private String noRekening;  // 8-digit account number
    private String kodeCIF;     // 5-digit CIF code
    private double setoranAwal; // Initial deposit, minimum 50,000
    private double saldoAkhir;  // Final balance, minimum 50,000

    // Constructor
    public Tabungan(String noRekening, String kodeCIF, double setoranAwal,double saldoAkhir) {
        if (noRekening.length() != 8 || !noRekening.matches("\\d+")) {
            throw new IllegalArgumentException("Nomor rekening harus berupa 8 digit angka.");
        }
        if (kodeCIF.length() != 5 || !kodeCIF.matches("\\d+")) {
            throw new IllegalArgumentException("Kode CIF harus berupa 5 digit angka.");
        }
        if (setoranAwal < 50000) {
            throw new IllegalArgumentException("Setoran awal minimal 50.000.");
        }

        this.noRekening = noRekening;
        this.kodeCIF = kodeCIF;
        this.setoranAwal = setoranAwal;
        this.saldoAkhir = saldoAkhir; // Saldo awal sama dengan setoran awal
    }

    // Getters
    public String getNoRekening() {
        return noRekening;
    }

    public String getKodeCIF() {
        return kodeCIF;
    }

    public double getSetoranAwal() {
        return setoranAwal;
    }

    public double getSaldoAkhir() {
        return saldoAkhir;
    }



    // Setters
    public void setNoRekening(String noRekening) {
        if (noRekening.length() != 8 || !noRekening.matches("\\d+")) {
            throw new IllegalArgumentException("Nomor rekening harus berupa 8 digit angka.");
        }
        this.noRekening = noRekening;
    }

    public void setKodeCIF(String kodeCIF) {
        if (kodeCIF.length() != 5 || !kodeCIF.matches("\\d+")) {
            throw new IllegalArgumentException("Kode CIF harus berupa 5 digit angka.");
        }
        this.kodeCIF = kodeCIF;
    }

    public void setSetoranAwal(double setoranAwal) {
        if (setoranAwal < 50000) {
            throw new IllegalArgumentException("Setoran awal minimal 50.000.");
        }
        this.setoranAwal = setoranAwal;
        this.saldoAkhir = setoranAwal; // Mengatur saldo awal
    }

    public void setSaldoAkhir(double saldoAkhir) {
        if (saldoAkhir < 50000) {
            throw new IllegalArgumentException("Saldo akhir minimal 50.000.");
        }
        this.saldoAkhir = saldoAkhir;
    }
}