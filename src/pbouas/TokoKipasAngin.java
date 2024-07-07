
package pbouas;

public class TokoKipasAngin {
    private KipasAngin[] daftarKipasAngin;
    private int jumlahKipas;

    // Konstruktor
    public TokoKipasAngin(int kapasitas) {
        daftarKipasAngin = new KipasAngin[kapasitas];
        jumlahKipas = 0;
    }

    // Menambahkan kipas angin ke dalam toko
    public void tambahKipasAngin(KipasAngin kipas) {
        if (jumlahKipas < daftarKipasAngin.length) {
            daftarKipasAngin[jumlahKipas] = kipas;
            jumlahKipas++;
        } else {
            System.out.println("Kapasitas toko sudah penuh.");
        }
    }

    // Menampilkan semua kipas angin di toko
    public void tampilkanKipasAngin() {
        System.out.println("\nDetail Kipas Angin:");
        for (int i = 0; i < jumlahKipas; i++) {
            KipasAngin kipas = daftarKipasAngin[i];
            System.out.println("Merek: " + kipas.getMerek() + ", Harga: " + kipas.getHarga() + 
                               ", Jenis: " + kipas.getJenis() + ", Diskon: " + kipas.hitungDiskon());
            if (kipas instanceof KipasAnginPremium) {
                KipasAnginPremium kipasPremium = (KipasAnginPremium) kipas;
                System.out.println("Fitur Remote Control: " + (kipasPremium.isFiturRemoteControl() ? "Ya" : "Tidak"));
            }
        }
    }

    // Menampilkan detail kipas angin berdasarkan indeks
    public void tampilkanDetailKipas(int indeks) {
        try {
            KipasAngin kipas = daftarKipasAngin[indeks];
            System.out.println("Detail kipas angin pada indeks " + indeks + ":");
            System.out.println("Merek: " + kipas.getMerek() + ", Harga: " + kipas.getHarga() + 
                               ", Jenis: " + kipas.getJenis() + ", Diskon: " + kipas.hitungDiskon());
            if (kipas instanceof KipasAnginPremium) {
                KipasAnginPremium kipasPremium = (KipasAnginPremium) kipas;
                System.out.println("Fitur Remote Control: " + (kipasPremium.isFiturRemoteControl() ? "Ya" : "Tidak"));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan: Indeks di luar batas.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
