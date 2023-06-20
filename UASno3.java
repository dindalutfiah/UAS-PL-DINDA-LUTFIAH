import java.util.Scanner;

public class UASno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menghitungKelipatanLima = 0;

        System.out.println("Masukkan 10 angka yang berbeda:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                menghitungKelipatanLima++;
            }
        }
        System.out.println("Jumlah angka yang merupakan kelipatan 5: " + menghitungKelipatanLima);
    }
}
