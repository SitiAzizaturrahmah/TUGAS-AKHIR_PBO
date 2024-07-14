package UAS;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengguna
        Pengguna pengguna = new Pengguna();
        pengguna.setId(1);
        pengguna.setUsername("john_doe");
        pengguna.setPassword("password123");

        // Menampilkan informasi Pengguna
        System.out.println("Pengguna ID: " + pengguna.getId());
        System.out.println("Pengguna Username: " + pengguna.getUsername());
        System.out.println("Pengguna Password: " + pengguna.getPassword());

        // Membuat objek Buku menggunakan konstruktor berparameter
        Buku buku = new Buku(1, "Belajar Java", "John Doe", 50000, 300);

        // Menampilkan informasi Buku
        buku.printInfo();

        // Menaikkan harga buku
        buku.naikkanHarga();
        buku.printInfo();

        // Membuat objek Komik menggunakan konstruktor berparameter
        Komik komik = new Komik(2, "Komik Naruto", "Masashi Kishimoto", 35000, 150, 1);

        // Menampilkan informasi Komik
        komik.printInfo();

        // Menaikkan harga komik
        komik.naikkanHarga();
        komik.printInfo();

        // Membuat objek Film menggunakan konstruktor berparameter
        Film film = new Film(3, "Film Aksi", "John Smith", 100, 8.5);

        // Menampilkan informasi Film
        film.printInfo();

        // Menaikkan harga film
        film.naikkanHarga();
        film.printInfo();
    }
}

class Pengguna {
    private int id;
    private String username;
    private String password;

    public void login() {
        System.out.println("Ini method untuk Login");
    }

    public void daftar() {
        System.out.println("Ini method Daftar user baru");
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
}

class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    public Buku(int id, String judul, String penulis, double harga, int jumlahHalaman) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }

    public void naikkanHarga() {
        harga += 5000;
    }

    public void naikkanHarga(double kenaikan) {
        harga += kenaikan;
    }
}

class Komik extends Buku {
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

class Film {
    private int id;
    private String judul;
    private String sutradara;
    private int durasi;
    private double rating;

    public Film() {
        System.out.println("Object Film telah diciptakan, constructor berjalan");
    }

    public Film(int id, String judul, String sutradara, int durasi, double rating) {
        this.id = id;
        this.judul = judul;
        this.sutradara = sutradara;
        this.durasi = durasi;
        this.rating = rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public int getDurasi() {
        return durasi;
    }

    public double getRating() {
        return rating;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Rating: " + rating);
    }

    public void naikkanHarga() {
        rating += 1.0;
    }

    public void naikkanHarga(double kenaikan) {
        rating += kenaikan;
    }
}
