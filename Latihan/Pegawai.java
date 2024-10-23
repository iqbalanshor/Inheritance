public class Pegawai {
    // Atribut private
    private String nama;
    private double gajiPokok;

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk gaji pokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk gaji pokok
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Method untuk mencetak informasi pegawai
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
