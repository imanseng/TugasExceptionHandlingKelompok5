import java.util.Scanner;
public class MainKalkulator {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("        Kalkulator Pembagian       ");
        System.out.println("===================================");

        // INPUT PEMBILANG
        System.out.print("Masukkan Angka Pembilang: ");
        int pembilang = input.nextInt();

        // INPUT PENYEBUT
        System.out.print("Masukkan Angka Penyebut: ");
        int penyebut = input.nextInt();

        // TRY
        try {
            int hasil = pembilang / penyebut;
            System.out.println("===================================");
            System.out.println("Hasil dari: " + pembilang + " / " + penyebut + " = " + hasil);
        
        // CATCH
        } catch (ArithmeticException e) {
            System.out.println("[ERROR!!] TIDAK BISA MELAKUKAN PEMBAGIAN DENGAN NOL");
            System.out.println("Detail error: " + e.getMessage());
        
        // FINALLY
        } finally {
            System.out.println("===================================");
            System.out.println("    Terima Kasih, Program Selesai!");
            input.close();
        }
    }
}