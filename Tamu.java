package UAS;

public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public Tamu() {
        super(); // Memanggil konstruktor default Pengguna
        System.out.println("Object Tamu telah diciptakan, constructor berjalan");
    }

    public Tamu(int id, String username, String password, int sisaMasaAktif) {
        super(id, username, password); // Memanggil konstruktor Pengguna dengan parameter id, username, password
        this.sisaMasaAktif = sisaMasaAktif;
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    public int getSisaMasaAktif() {
        return sisaMasaAktif;
    }

    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif += tambahan;
    }
}
