import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String barang[] = new String[5];
        System.out.println("Selection Sort");
        System.out.println("Masukkan Data Awal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data " + (i + 1) + " = ");
            barang[i] = s.next();
        }
        System.out.print("Data Awal : ");
        for (int i = 0; i < barang.length; i++) {
            System.out.print(barang[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < barang.length - 1; i++) {
            for (int j = i + 1; j < barang.length; j++) {
                if (barang[i].compareToIgnoreCase(barang[j]) > 0) {
                    String temp = barang[j];
                    barang[j] = barang[i];
                    barang[i] = temp;
                }
            }
        }
        System.out.print("Data Akhir : ");
        for (int i = 0; i < barang.length; i++) {
            System.out.print(barang[i] + " ");
        }
        System.out.println("");
        System.out.print("Data Akhir : ");
        for (int i = 0; i < barang.length; i++) {
            System.out.print(barang[i] + " ");
        }
        System.out.println("");

        int data[] = { 13000, 12500, 23000, 31000, 14500 };
        System.out.println("Harga");
        System.out.print("Data Awal ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                }

            }
        }
        System.out.print("Harga Terkecil :");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
