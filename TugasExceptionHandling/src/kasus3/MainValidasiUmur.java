public class MainValidasiUmur {

    public static void main(String[] args) {
        // Memanggil Class ValidasiUmur yang berada di file terpisah
        ValidasiUmur sistem = new ValidasiUmur();

        System.out.println("--- Simulasi Input Benar ---");
        sistem.prosesPendaftaran("20");

        System.out.println("\n--- Simulasi Input Salah ---");
        sistem.prosesPendaftaran("dua puluh");
    }
}
