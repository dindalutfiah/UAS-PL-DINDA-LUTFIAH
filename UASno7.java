import java.util.ArrayList;
import java.util.List;

public class UASno7 {

    public static void main(String[] args) {
        String[] array = { "Bunga", "Buah", "Benda", "Tumbuhan", "Hewan" };

        List<Integer> menemukanIndeks = temukanIndeksTeks(array, 5);

        hasilCetak(menemukanIndeks);
    }

    public static List<Integer> temukanIndeksTeks(String[] array, int length) {
        List<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (memilikiPanjang(array[i], length)) {
                indeks.add(i);
            }
        }

        return indeks;
    }

    public static boolean memilikiPanjang(String text, int length) {
        return text.length() == length;
    }

    public static void hasilCetak(List<Integer> menemukanIndeks) {
        if (menemukanIndeks.isEmpty()) {
            System.out.println("Tidak ada teks dengan panjang 5 karakter.");
        } else {
            System.out.println("Indeks teks dengan panjang 5 karakter:");

            for (int index : menemukanIndeks) {
                System.out.println(index);
            }
        }
    }
}
