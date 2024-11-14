
public class RekeningBank {
    //private
    private String nomerRekening;
    private double saldo;

    //constructor
    public RekeningBank (String nomerRekening,double saldo) {
        this.nomerRekening =nomerRekening;
        this.saldo =saldo;
    }
    //geter
    public String getNomerRekening() {
        return (this.nomerRekening);
    }
    public double getSaldo() {
        return (this.saldo);
    }


    // Setter untuk saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo =0;
            System.out.println("Saldo tidak valid!");
        }
    }

    // Method untuk setor
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor uang berhasi,saldo anda sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setor tidak valid!");
        }
    }

    // Method untuk tarik
    public void tarik(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo sekarang: " + saldo);
        } else if (jumlah > 0 && saldo < jumlah) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            System.out.println("Jumlah tarik tidak valid!");
        }
    }
}