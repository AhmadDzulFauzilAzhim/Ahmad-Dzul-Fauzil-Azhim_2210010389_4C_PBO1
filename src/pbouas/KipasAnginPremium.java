
package pbouas;

public class KipasAnginPremium extends KipasAngin {
    private boolean fiturRemoteControl;

    // Konstruktor
    public KipasAnginPremium(String merek, double harga, String jenis, double diskonTambahan, boolean fiturRemoteControl) {
        super(merek, harga, jenis, diskonTambahan);
        this.fiturRemoteControl = fiturRemoteControl;
    }

    // Mutator (Setter)
    public void setFiturRemoteControl(boolean fiturRemoteControl) {
        this.fiturRemoteControl = fiturRemoteControl;
    }

    // Accessor (Getter)
    public boolean isFiturRemoteControl() {
        return fiturRemoteControl;
    }

    // Overriding (Polymorphism)
    @Override
    public double hitungDiskon() {
        double diskon = super.hitungDiskon();
        if (fiturRemoteControl) {
            diskon += 50; // Tambahan diskon jika ada fitur remote control
        }
        return diskon;
    }
}