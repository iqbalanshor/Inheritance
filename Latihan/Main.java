public class Main {
        public static void main(String[] args) {
                // Membuat objek Manager
                Manager manager = new Manager();
                manager.setNama("Iqbal");
                manager.setGajiPokok(1000000);
                manager.setTunjangan(2000000);
                System.out.println("Info Manager:");
                manager.cetakInfo();

                // Membuat objek Programmer
                Programmer programmer = new Programmer();
                programmer.setNama("Anshor");
                programmer.setGajiPokok(8000000);
                programmer.setBonus(1000000);
                System.out.println("\nInfo Programmer:");
                programmer.cetakInfo();
        }
}