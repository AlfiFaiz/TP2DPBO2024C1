public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String alamat; // Atribut baru

    public Mahasiswa(String nim, String nama, String jenisKelamin, String alamat) { // Constructor diperbarui
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    // Getter dan setter untuk alamat

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
}
