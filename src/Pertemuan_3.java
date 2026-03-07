public class Pertemuan_3 {
    public static void main(String[] args) {

        int[] x = {20, 15, 90, 13, 26};

        // Menampilkan nilai awal
        System.out.print("Nilai awal : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < x.length - 1; i++) {

            int min = 999999;
            int index = i;

            // mencari nilai terkecil
            for (int j = i; j < x.length; j++) {
                if (x[j] < min) {
                    min = x[j];
                    index = j;
                }
            }

            // proses tukar (swap)
            if (x[i] > x[index]) {
                int temp = x[i];
                x[i] = x[index];
                x[index] = temp;
            }

            // menampilkan hasil setiap iterasi
            System.out.print("Iterasi ke-" + (i + 1) + " : ");
            for (int k = 0; k < x.length; k++) {
                System.out.print(x[k] + " ");
            }
            System.out.println();
        }

        // hasil akhir
        System.out.print("\nHasil akhir : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}