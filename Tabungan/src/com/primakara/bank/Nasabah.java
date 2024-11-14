package com.primakara.bank;

public class Nasabah {

    // Private attributes
    private String kodeCIF; // 5-digit unique code
    private String NIK; // 16-digit identification number
    private String namaNasabah;
    private String Alamat;
    private String Telp;
    private String namaIbuKandung;
    private String Pekerjaan;
    private String penghasilanRataRataSebulan;
    private String PesanEror;
    private Tabungan[] listTabungan;
    private int jmlTabungan;

    // Constructor with all mandatory fields
    public Nasabah(String kodeCIF, String NIK) {
        if (kodeCIF.length() != 5 || !kodeCIF.matches("\\d+")) {
            PesanEror += "Kode CIF harus berupa 5 digit angka.";
        }
        if (NIK.length() != 16 || !NIK.matches("\\d+")) {
            PesanEror += "Kode NIK harus berupa 16 digit angka.";
        }

        this.kodeCIF = kodeCIF;
        this.NIK = NIK;
        this.namaNasabah = namaNasabah;
        this.Alamat = Alamat;
        this.Telp = Telp;
        this.namaIbuKandung = namaIbuKandung;
        this.Pekerjaan = Pekerjaan;
        this.penghasilanRataRataSebulan = penghasilanRataRataSebulan;
        this.jmlTabungan = 0;
        this.listTabungan = new Tabungan[3];

    }
    //Assign tabungan

    public void addTabungan(Tabungan tabBaru) {
        if (this.jmlTabungan < 3) {
            this.listTabungan[jmlTabungan] = tabBaru;
            this.jmlTabungan++;
        }else
            System.out.println("Jumbah rek maksismal 3");
    }

    //Getter
    public Tabungan[] getListTabungan() {
        return (this.listTabungan);
    }
    public int getJmlTabungan() {
        return (this.jmlTabungan);
    }


    // Getters
    public String getKodeCIF() {
        return kodeCIF;
    }

    public String getTelp() {
        return Telp;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public String getNamaIbuKandung() {
        return namaIbuKandung;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getPenghasilanRataRataSebulan() {
        return penghasilanRataRataSebulan;
    }
    // Setters
    public void setKodeCIF(String kodeCIF) {
        if (kodeCIF.length() != 5 || !kodeCIF.matches("\\d+")) {
            throw new IllegalArgumentException("Kode CIF harus berupa 5 digit angka.");
        }
        this.kodeCIF = kodeCIF;
    }

    public void setNIK(String NIK) {
        if (NIK.length() != 16 || !NIK.matches("\\d+")) {
            throw new IllegalArgumentException("NIK harus berupa 16 digit angka.");
        }
        this.NIK = NIK;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public void setTelp(String Telp) {
        this.Telp = Telp;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setNamaIbuKandung(String namaIbuKandung) {
        this.namaIbuKandung = namaIbuKandung;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public void setPenghasilanRataRataSebulan(String penghasilanRataRataSebulan) {
        this.penghasilanRataRataSebulan = penghasilanRataRataSebulan;
    }

    public void viewPesanError() {
        System.out.println(this.PesanEror);
    }

}





