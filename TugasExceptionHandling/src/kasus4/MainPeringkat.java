package kasus4;

public class MainPeringkat {
    public static void main(String[] args) {
        String[] mahasiswa = {"Agus", "Udin", "Ujang", "Dimas", "Ucup"};
        int peringkatDicari = 10;

        try {
            String nama = mahasiswa[peringkatDicari - 1];
            System.out.println("Mahasiswa peringkat ke-" + peringkatDicari + ": " + nama);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Peringkat ke-" + peringkatDicari + " tidak ditemukan.");
            System.out.println("Data peringkat hanya tersedia dari 1 hingga " + mahasiswa.length + ".");
        }
    }
}
