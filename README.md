# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data toko kipas angin menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek, harga, jenis, diskon tambahan, fitur remote control dan memberikan output berupa informasi Harga, merek, jenis, dan diskon yang didapatkan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KipasAngin`, `KipasAnginPremium`, `TokoKipasAngin`, dan `Main` adalah contoh dari class.

```bash
public class KipasAngin {
    ...
}

public class KipasAnginPremium extends KipasAngin {
    ...
}

public class TokoKipasAngin {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `TokoKipasAngin toko = new TokoKipasAngin(jumlahKipas);` adalah contoh pembuatan object.

```bash
TokoKipasAngin toko = new TokoKipasAngin(jumlahKipas);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merek`, `harga`, `jenis`, `diskonTambahan`, dan `fiturRemoteControl;` adalah contoh atribut.

```bash
String merek;
double harga;
String jenis;
double diskonTambahan;
boolean fiturRemoteControl;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KipasAngin`, `KipasAnginPremium`, dan `TokoKipasAngin`.

```bash
public KipasAngin(String merek, double harga, String jenis, double diskonTambahan) {
        this.merek = merek;
        this.harga = harga;
        this.jenis = jenis;
        this.diskonTambahan = diskonTambahan;
}

public KipasAnginPremium(String merek, double harga, String jenis, double diskonTambahan, boolean fiturRemoteControl) {
        super(merek, harga, jenis, diskonTambahan);
        this.fiturRemoteControl = fiturRemoteControl;
}

public TokoKipasAngin(int kapasitas) {
        daftarKipasAngin = new KipasAngin[kapasitas];
        jumlahKipas = 0;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerek`, `setHarga`, `setJenis`, `setDiskonTambahan` dan `setFiturRemoteControl` adalah contoh method mutator.

```bash
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

public void setFiturRemoteControl(boolean fiturRemoteControl) {
        this.fiturRemoteControl = fiturRemoteControl;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerek`, `getHarga`, `getJenis`, `getDiskonTambahan`, dan `isFiturRemoteControl` adalah contoh method accessor.

```bash
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

public boolean isFiturRemoteControl() {
        return fiturRemoteControl;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merek`, `harga`, `jenis`, `diskonTambahan`, dan `fiturRemoteControl;` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merek;
private double harga;
private String jenis;
private double diskonTambahan;
private boolean fiturRemoteControl;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KipasAnginPremium` mewarisi `KipasAngin` dengan sintaks `extends`.

```bash
public class KipasAnginPremium extends KipasAngin {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `hitungDiskon()` di `KipasAnginPremium` merupakan override dari method `hitungDiskon()` di `KipasAngin`.

```bash
public double hitungDiskon() {
        if (jenis.equalsIgnoreCase("langit-langit")) {
            return harga * 0.10 + diskonTambahan;
        } else if (jenis.equalsIgnoreCase("meja")) {
            return harga * 0.15 + diskonTambahan;
        } else {
            return harga * 0.05;
        }
}

@Override
public double hitungDiskon() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `tambahKipasAngin`.

```bash
public void tambahKipasAngin(KipasAngin kipas) {
        if (jumlahKipas < daftarKipasAngin.length) {
            daftarKipasAngin[jumlahKipas] = kipas;
            jumlahKipas++;
        } else {
            System.out.println("Kapasitas toko sudah penuh.");
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahKipas; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan jumlah kipas angin: ");
int jumlahKipas = scanner.nextInt();
scanner.nextLine();

System.out.print("Merek: ");
System.out.print("Harga: ");
System.out.print("Jenis (langit-langit/meja/lainnya): ");
System.out.print("Masukkan diskon tambahan: ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KipasAngin[] daftarKipasAngin;` adalah contoh penggunaan array.

```bash
KipasAngin[] daftarKipasAngin;
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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
    
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ahmad Dzul Fauzil Azhim
NPM: 2210010389
