import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UASno10 {
    public static void main(String[] args) {
        // Mencari kelipatan 5
        int[] array = { 50, 38, 10, 15, 65, 95, 31, 25 };

        List<Integer> kelipatan = temukanKelipatanLima(array);
        mengurutkan(kelipatan);

        System.out.println("Angka-angka kelipatan 5 yang diurutkan:");
        for (int number : kelipatan) {
            System.out.println(number);
        }
    }

    public static List<Integer> temukanKelipatanLima(int[] array) {
        // memanggil method untuk mencari angka-angka kelipatan 5 dalam array.
        List<Integer> kelipatan = new ArrayList<>();

        for (int number : array) {
            if (number % 5 == 0) {
                kelipatan.add(number);
            }
        }

        return kelipatan;
    }

    public static void mengurutkan(List<Integer> list) {
        Integer[] array = list.toArray(new Integer[0]);
        Arrays.sort(array);

        list.clear();
        list.addAll(Arrays.asList(array));
    }
}
