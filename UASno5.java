import java.util.Scanner;

public class UASno5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mengisi array menggunakan angka-angka tersebut
        int[] angka = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        int[] result = search(angka, target);

        if (result.length == 0) {
            System.out.println("Angka tidak ditemukan dalam array.");
        } else {
            System.out.print("Angka ditemukan pada indeks: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] search(int[] array, int target) {
        int menghitung = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                menghitung++;
            }
        }

        int[] indeks = new int[menghitung];
        int indeksSaatIni = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indeks[indeksSaatIni] = i;
                indeksSaatIni++;
            }
        }

        return indeks;
    }
}
