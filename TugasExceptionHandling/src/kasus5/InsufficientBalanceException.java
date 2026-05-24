package kasus5;

// Mewarisi Exception agar menjadi Checked Exception
public class InsufficientBalanceException extends Exception {
    // Constructor untuk menerima pesan error kustom
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
