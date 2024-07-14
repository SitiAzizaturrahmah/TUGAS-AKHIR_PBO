package UAS;

public class Komik extends Buku {
    private int volume;

    public Komik() {
        System.out.println("Object Komik telah diciptakan, constructor berjalan");
    }

    public Komik(int id, String judul, String penulis, double harga, int jumlahHalaman, int volume) {
        super(id, judul, penulis, harga, jumlahHalaman);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Volume: " + volume);
    }

    @Override
    public void naikkanHarga() {
        double kenaikan = getHarga() * 0.20;
        setHarga(getHarga() + kenaikan);
        System.out.println("Harga setelah kenaikan: " + getHarga());
    }
}
