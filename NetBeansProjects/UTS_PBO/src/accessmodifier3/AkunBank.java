package accessmodifier3;

public class AkunBank {
    // Modifier: private
    private String noRekening;
    private double saldo;

    // Konstruktor
    public AkunBank(String noRekening, double saldoAwal) {
        this.noRekening = noRekening;
        this.saldo = saldoAwal;
    }

    // Method public untuk mengakses data (getter)
    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method public untuk mengubah saldo (setter)
    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor: " + jumlah);
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik: " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    public void tampilSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}
