public class Programmer extends Pegawai {
    // Atribut private
    private double bonus;

    // Setter untuk bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getter untuk bonus
    public double getBonus() {
        return bonus;
    }

    // Override method cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: " + bonus);
    }

    // Method untuk mencetak bonus
    public void cetakBonus() {
        System.out.println("Bonus: " + bonus);
    }
}
