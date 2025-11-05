package accessmodifier3;

public class Main3 {
    public static void main(String[] args) {
        RekeningTabungan tabungan = new RekeningTabungan("123456789", 2000000);

        System.out.println("=== Data Awal Rekening ===");
        System.out.println("No Rekening: " + tabungan.getNoRekening());
        tabungan.tampilSaldo();

        System.out.println("\n=== Transaksi ===");
        tabungan.setor(100000);
        tabungan.tarik(200000);
        tabungan.hitungBunga();

        System.out.println("\n=== Data Akhir Rekening ===");
        tabungan.tampilSaldo();
    }
}
