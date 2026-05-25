public class ValidasiUmur {

    public void prosesPendaftaran(String inputUmur) {
        try {
            int umur = Integer.parseInt(inputUmur);
            
            // Jika berhasil diubah, tampilkan hasil
            System.out.println("Pendaftaran berhasil! Umur Anda: " + umur + " tahun.");
            
        } catch (NumberFormatException e) {
            // Penanganan jika pengguna memasukkan huruf atau format salah
            System.out.println("Error: Input tidak valid! Harap masukkan angka (misal: '20'), bukan huruf.");
        }
    }
}
