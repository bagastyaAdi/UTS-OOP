
    public class Main {
        public static void main(String[] args) {
            // Membuat beberapa objek RekeningBank
            RekeningBank rekening1 = new RekeningBank("123456", 5000);
            RekeningBank rekening2 = new RekeningBank("654321", -2000); // Saldo tidak valid
            RekeningBank rekening3 = new RekeningBank("789012", 10000);

            // Melakukan transaksi penyetoran dan penarikan
            System.out.println("\nTransaksi pada Rekening 1:");
            rekening1.setor(2000);  // Setor 2000
            rekening1.tarik(1000);  // Tarik 1000
            rekening1.tarik(8000);  // Tarik melebihi saldo, harus gagal

            System.out.println("\nTransaksi pada Rekening 3:");
            rekening3.setor(-500);  // Setor negatif, harus gagal
            rekening3.tarik(5000);  // Tarik 5000
        }
    }