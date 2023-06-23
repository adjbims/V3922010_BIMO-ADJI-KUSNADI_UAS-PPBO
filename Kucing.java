// Definisikan kelas Kucing sebagai turunan dari Hewan
class Kucing extends Hewan {
    private String jenisBulu;

    // Konstruktor untuk inisialisasi objek Kucing
    public Kucing(String nama, int usia, String jenisBulu) {
        super(nama, usia);
        this.jenisBulu = jenisBulu;
    }

    // Metode untuk mendapatkan jenis bulu kucing
    public String getJenisBulu() {
        return jenisBulu;
    }

    // Override metode suara untuk kucing
    @Override
    public void suara() {
        System.out.println("Kucing " + getNama() + " mengeong.");
    }
}