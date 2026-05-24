package kasus1;

public class MainDataNull {
    public static void main(String[] args){
        String user1 = "Neila Asynur";
        String user2 = null;

        formatAndPrint(user1);
        formatAndPrint(user2);
    }
    public static void formatAndPrint(String name) {
        try{
            String formatName = name.toUpperCase();
            System.out.println("Nama Pengguna: " + formatName);
        } catch (NullPointerException e) {
            System.out.println("Terdeteksi nama lengkap belum terisi!: " + e.getMessage());
        }
    }
}
