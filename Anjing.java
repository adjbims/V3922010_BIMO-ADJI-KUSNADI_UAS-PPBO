// Definisikan kelas Anjing sebagai turunan dari Hewan
class Anjing extends Hewan {
    private String ras;

    // Konstruktor untuk inisialisasi objek Anjing
    public Anjing(String nama, int usia, String ras) {
        super(nama, usia);
        this.ras = ras;
    }

    // Metode untuk mendapatkan ras anjing
    public String getRas() {
        return ras;
    }

    // Override metode suara untuk anjing
    @Override
    public void suara() {
        System.out.println("Anjing " + getNama() + " menggonggong.");
    }
}