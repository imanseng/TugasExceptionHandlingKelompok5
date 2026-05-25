public class ValidasiUmur {

    public void prosesPendaftaran(String inputUmur) {
        try {
            // Kode berisiko: Mengubah String menjadi integer
            int umur = Integer.parseInt(inputUmur);
            
            // Jika berhasil diubah, tampilkan hasil
            System.out.println("Pendaftaran berhasil! Umur Anda: " + umur + " tahun.");
            
        } catch (NumberFormatException e) {
            // Penanganan jika pengguna memasukkan huruf atau format salah
            System.out.println("Error: Input tidak valid! Harap masukkan angka (misal: '20'), bukan huruf.");
        }
    }

    public static void main(String[] args) {
        ValidasiUmur sistem = new ValidasiUmur();

        System.out.println("--- Simulasi Input Benar ---");
        sistem.prosesPendaftaran("20");

        System.out.println("\n--- Simulasi Input Salah ---");
        sistem.prosesPendaftaran("dua puluh");
    }
}
