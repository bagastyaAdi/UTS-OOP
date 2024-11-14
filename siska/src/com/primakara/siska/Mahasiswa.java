package com.primakara.siska;

public class Mahasiswa {
    // Atribut disembunyikan
    private String nama;
    private String NIM;
    private double IPK;

    // Constructor untuk menginisialisasi atribut
    public Mahasiswa(String nama, String NIM, double IPK) {
        this.nama = nama;
        this.NIM = NIM;
        setIPK(IPK);  // Menggunakan setter untuk validasi IPK
    }

    // Getter untuk atribut nama
    public String getNama() {
        return this.nama;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk atribut NIM
    public String getNIM() {
        return this.NIM;
    }

    // Setter untuk atribut NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // Getter untuk atribut IPK
    public double getIPK() {
        return this.IPK;
    }

    // Setter untuk atribut IPK dengan validasi
    public void setIPK(double IPK) {
        if (IPK >= 0.0 && IPK <= 4.0) {
            this.IPK = IPK;
        } else {
            System.out.println("IPK tidak valid!");
            this.IPK = 0.0;  // Set IPK ke 0 jika nilai tidak valid
        }
    }
}
