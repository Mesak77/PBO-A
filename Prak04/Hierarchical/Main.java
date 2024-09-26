// Kelas Karyawan
class Karyawan {
    private String id;
    private String nama;

    public Karyawan(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void getInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama);
    }

    public void absenPagi() {
        System.out.println(nama + " melakukan absen pagi.");
    }

    public void kerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    public void absenPulang() {
        System.out.println(nama + " melakukan absen pulang.");
    }
}

// Kelas Dosen (turunan dari Karyawan)
class Dosen extends Karyawan {
    private String nip;

    public Dosen(String id, String nip, String nama) {
        super(id, nama);
        this.nip = nip;
    }

    public void ngajar() {
        System.out.println(super.nama + " sedang mengajar.");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("NIP: " + nip);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Objek Karyawan
        Karyawan Ridho = new Karyawan("23210002", "Ridho Putra");
        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        System.out.println();

        Karyawan Amir = new Karyawan("23210020", "Amir Murtako");
        Amir.getInfo();
        Amir.absenPagi();
        Amir.kerja();
        Amir.absenPulang();

        System.out.println();

        // Objek Dosen
        Dosen Rina = new Dosen("2323", "2121", "Rina");
        Rina.getInfo();
        Rina.absenPagi();
        Rina.kerja();
        Rina.ngajar();
        Rina.absenPulang();

        System.out.println();

        Dosen BuIon = new Dosen("112233", "1133", "Bu Ion");
        BuIon.getInfo();
        BuIon.absenPagi();
        BuIon.kerja();
        BuIon.ngajar();
        BuIon.absenPulang();
    }
}
