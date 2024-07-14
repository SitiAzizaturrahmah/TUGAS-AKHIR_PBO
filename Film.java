package TUGAS_AKHIR;

public class Film {
    private int id;
    private String judul;
    private String sutradara;
    private double durasi;
    private double rating;

    public Film() {
        System.out.println("Object Film telah diciptakan, constructor berjalan");
    }

    public Film(int id, String judul, String sutradara, double durasi, double rating) {
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

    public void setDurasi(double durasi) {
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

    public double getDurasi() {
        return durasi;
    }

    public double getRating() {
        return rating;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Durasi: " + durasi + " jam");
        System.out.println("Rating: " + rating);
    }

    public void tingkatkanRating() {
        rating += 0.5; 
    }

    public void tingkatkanRating(double peningkatan) {
        rating += peningkatan;
    }
}
