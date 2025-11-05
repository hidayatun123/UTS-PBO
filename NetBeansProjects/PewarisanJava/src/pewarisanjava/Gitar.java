package pewarisanjava;

public class Gitar extends AlatMusik {
    int jumlahSenar;

    @Override
    void bunyi() {
        System.out.println("Gitar berbunyi: Jreng... Jreng...");
    }

    void infoGitar() {
        System.out.println("Nama alat musik: " + nama);
        System.out.println("Jumlah senar: " + jumlahSenar);
    }
}

