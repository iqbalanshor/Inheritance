public class Manager extends Pegawai {
    // Atribut private
    private double tunjangan;

    // Setter untuk tunjangan
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public double getTunjangan() {
        return tunjangan;
    }

    // Override method cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }

    // Method untuk mencetak tunjangan
    public void cetakTunjangan() {
        System.out.println("Tunjangan: " + tunjangan);
    }
}
