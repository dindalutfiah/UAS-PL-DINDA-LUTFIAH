public class UASno9 {
    public static void main(String[] args) {
        int[] angka = { 10, 25, 7, 30, 15, 12, 20, 40, 5 };

        int maksKelipatanLimaIndeks = temukanKelipatanMaksDariLimaIndeks(angka);

        if (maksKelipatanLimaIndeks == -1) {
            System.out.println("Tidak ada angka kelipatan 5 dalam array.");
        } else {
            System.out.println("Angka terbesar yang merupakan kelipatan 5: " + angka[maksKelipatanLimaIndeks]);
            System.out.println("Indeks angka terbesar yang merupakan kelipatan 5: " + maksKelipatanLimaIndeks);
        }
    }

    public static int temukanKelipatanMaksDariLimaIndeks(int[] array) {
        int indeksTerbesar = -1;
        int maksKelipatanLima = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] > maksKelipatanLima) {
                maksKelipatanLima = array[i];
                indeksTerbesar = i;
            }
        }

        return indeksTerbesar;
    }
}
