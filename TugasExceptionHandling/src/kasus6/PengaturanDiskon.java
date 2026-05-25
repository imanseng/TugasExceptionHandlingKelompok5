package kasus6;

public class PengaturanDiskon {

    // Metode untuk mengubah diskon dengan validasi argumen
    public static void setPersentaseDiskon(double diskon) {
        if (diskon < 0 || diskon > 100) {
            throw new IllegalArgumentException("Persentase diskon harus bernilai antara 0% hingga 100%. Input: " + diskon + "%");
        }
        System.out.println("Sukses: Diskon berhasil diubah menjadi " + diskon + "%");
    }

    // Metode utama untuk mensimulasikan skenario
    public static void main(String[] args) {
        // Kasus 1 - Admin memasukkan diskon valid
        try {
            System.out.println("\nMencoba input diskon valid (25%):");
            setPersentaseDiskon(25);
        } catch (IllegalArgumentException e) {
            System.err.println("Gagal: " + e.getMessage());
        }

        // Kasus 2 - Admin tidak sengaja memasukkan diskon negatif (-15%)
        try {
            System.out.println("\nMencoba input diskon negatif (-15%):");
            setPersentaseDiskon(-15);
        } catch (IllegalArgumentException e) {
            System.err.println("Sistem Menolak: " + e.getMessage());
        }

        // Kasus - Admin tidak sengaja memasukkan diskon melebihi limit (120%)
        try {
            System.out.println("\nMencoba input diskon melebihi batas (120%):");
            setPersentaseDiskon(120);
        } catch (IllegalArgumentException e) {
            System.err.println("Sistem Menolak: " + e.getMessage());
        }
    }
}
