
package pbouas;

public class KipasAngin {
    private String merek;
    private double harga;
    private String jenis;
    private double diskonTambahan;

    // Konstruktor
    public KipasAngin(String merek, double harga, String jenis, double diskonTambahan) {
        this.merek = merek;
        this.harga = harga;
        this.jenis = jenis;
        this.diskonTambahan = diskonTambahan;
    }

    // Mutator (Setter)
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setDiskonTambahan(double diskonTambahan) {
        this.diskonTambahan = diskonTambahan;
    }

    // Accessor (Getter)
    public String getMerek() {
        return merek;
    }

    public double getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }

    public double getDiskonTambahan() {
        return diskonTambahan;
    }

    // Metode untuk menghitung diskon (Polymorphism)
    public double hitungDiskon() {
        if (jenis.equalsIgnoreCase("langit-langit")) {
            return harga * 0.10 + diskonTambahan;
        } else if (jenis.equalsIgnoreCase("meja")) {
            return harga * 0.15 + diskonTambahan;
        } else {
            return harga * 0.05;
        }
    }
}