package kasus5;

public class MainBank {
    private static double saldo = 200000;//saldo awal, static agar dapat dibaca dalam class ini
    public static void tarikUang(double jumlah) throws InsufficientBalanceException {//pass responsibility exception ini ke class InsufficientBalanceException
        if (jumlah > saldo) {
            //throw (buat objek baru) custom exception InsufficientBalanceException jika saldo tidak cukup
            throw new InsufficientBalanceException("Saldo Anda tidak mencukupi untuk melakukan penarikan sebesar Rp " + jumlah);
        }
        
        //hanya akan berjalan jika saldo cukup
        saldo -= jumlah;
    }

    //main class nya
    public static void main(String[] args){
        double jumlahTarik = 500000; //jumlah yang ingin ditarik

        System.out.println("Saldo awal Anda: Rp " + saldo);
        System.out.println("Mencoba menarik: Rp " + jumlahTarik);

        try {//try nya maggil method yang berpotensi throw exception
            tarikUang(jumlahTarik);
            System.out.println("Penarikan berhasil! Sisa saldo: Rp " + saldo);//jika tidak terkena exception(aman), maka ini ikut di-run
        } catch (InsufficientBalanceException e){//catch nya baru menangkap dan menangani custom exception yang terjadi
            System.out.println("\n[TRANSAKSI GAGAL]");
            System.out.println("Pesan Error: " + e.getMessage());//method getMessage berasal dari class Throwable, superclass dari Exception (superclass InsufficientBalanceException)
        }
    }



}
