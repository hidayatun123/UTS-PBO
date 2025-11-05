package pewarisan2;

public class Main2 {
    public static void main(String[] args) {
        Direktur d = new Direktur();

        System.out.println("=== Data Direktur ===");
        d.tampilData();        // method dari Pegawai
        d.tampilTunjangan();   // method dari Manajer
        d.tampilBonus();       // method dari Direktur
    }
}
