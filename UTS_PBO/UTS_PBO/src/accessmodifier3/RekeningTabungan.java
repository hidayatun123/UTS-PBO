package accessmodifier3;

public class RekeningTabungan extends AkunBank {
    private double bunga = 0.02; // 2% bunga

    public RekeningTabungan(String noRekening, double saldoAwal) {
        super(noRekening, saldoAwal);
    }

    public void hitungBunga() {
        double bungaDidapat = getSaldo() * bunga;
        setor(bungaDidapat);
        System.out.println("Bunga ditambahkan: " + bungaDidapat);
    }
}
