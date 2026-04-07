import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        /*Buku[] rakBuku = new Buku[2];
        
        rakBuku[0] = new Buku("Gio");
        rakBuku[1] = new Buku("sabar");
        rakBuku[2] = new Buku("gaada");

        for (int i = 0; i < rakBuku.length; i++) {
            System.out.println(rakBuku[i].getJudul());
        }*/

        /*ArrayList<String> daftarKaryawan = new ArrayList<>();
        daftarKaryawan.add("Gio");
        daftarKaryawan.add("Gio");
        daftarKaryawan.add("Gio");
        daftarKaryawan.add("Gio");
        daftarKaryawan.add("Gio");
        for (String karyawan : daftarKaryawan) {
            System.out.println(karyawan);
        }*/

        ArrayList<Pegawai> daftarKaryawan = new ArrayList<>();

        daftarKaryawan.add(new Manager("Gio"));

        Manager mgr = new Manager("Gio");

        daftarKaryawan.add(mgr);

        for (Pegawai daftar : daftarKaryawan) {
            daftar.bekerja();
        }
    }
}
