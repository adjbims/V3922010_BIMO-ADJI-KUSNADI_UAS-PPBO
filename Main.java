// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek anjing
        Anjing anjing = new Anjing("Bobby", 3, "Bulldog");

        // Memanggil metode dari objek anjing
        System.out.println("Nama anjing: " + anjing.getNama());
        System.out.println("Usia anjing: " + anjing.getUsia());
        System.out.println("Ras anjing: " + anjing.getRas());
        anjing.suara();

        System.out.println();

        // Membuat objek kucing
        Kucing kucing = new Kucing("Mimi", 2, "Anggora");

        // Memanggil metode dari objek kucing
        System.out.println("Nama kucing: " + kucing.getNama());
        System.out.println("Usia kucing: " + kucing.getUsia());
        System.out.println("Jenis bulu kucing: " + kucing.getJenisBulu());
        kucing.suara();
    }
}





