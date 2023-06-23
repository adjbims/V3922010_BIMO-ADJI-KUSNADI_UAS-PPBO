// Definisikan kelas induk Hewan
class Hewan {
    private String nama;
    private int usia;

    // Konstruktor untuk inisialisasi objek Hewan
    public Hewan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Metode untuk mendapatkan nama hewan
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan usia hewan
    public int getUsia() {
        return usia;
    }

    // Metode untuk mengeluarkan suara hewan
    public void suara() {
        System.out.println("Hewan ini mengeluarkan suara.");
    }
}