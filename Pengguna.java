package UAS;

public class Pengguna {
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
        System.out.println("Object Pengguna telah diciptakan, constructor berjalan");
    }

    public Pengguna(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        System.out.println("Object Pengguna dengan id " + id + " telah diciptakan, constructor berjalan");
    }
}
