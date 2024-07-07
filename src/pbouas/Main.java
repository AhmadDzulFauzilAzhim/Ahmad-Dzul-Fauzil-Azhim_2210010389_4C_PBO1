package pbouas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // IO Sederhana: Input data kipas angin
        System.out.print("Masukkan jumlah kipas angin: ");
        int jumlahKipas = scanner.nextInt();
        scanner.nextLine(); 

        TokoKipasAngin toko = new TokoKipasAngin(jumlahKipas);

        // Input data kipas angin
        for (int i = 0; i < jumlahKipas; i++) {
            System.out.println("Masukkan detail untuk kipas angin " + (i + 1));
            System.out.print("Merek: ");
            String merek = scanner.nextLine();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); 

            // Seleksi: Memeriksa apakah kipas langit-langit atau kipas meja
            System.out.print("Jenis (langit-langit/meja/lainnya): ");
            String jenis = scanner.nextLine();

            System.out.print("Masukkan diskon tambahan: ");
            double diskonTambahan = scanner.nextDouble();
            scanner.nextLine(); 

            // Memeriksa apakah kipas angin premium
            System.out.print("Apakah kipas angin ini memiliki fitur remote control (ya/tidak)? ");
            String fiturRemote = scanner.nextLine();
            boolean fiturRemoteControl = fiturRemote.equalsIgnoreCase("ya");

            KipasAngin kipas;
            if (fiturRemoteControl) {
                kipas = new KipasAnginPremium(merek, harga, jenis, diskonTambahan, fiturRemoteControl);
            } else {
                kipas = new KipasAngin(merek, harga, jenis, diskonTambahan);
            }

            toko.tambahKipasAngin(kipas);
        }

        // Perulangan: Mencetak semua data kipas angin
        toko.tampilkanKipasAngin();

        // Error Handling: Menangani kesalahan potensial
        System.out.print("Masukkan indeks untuk melihat detail kipas angin: ");
        int indeks = scanner.nextInt();
        toko.tampilkanDetailKipas(indeks);

        scanner.close();
    }
}