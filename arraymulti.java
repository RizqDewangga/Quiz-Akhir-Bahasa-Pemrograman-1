import java.util.Scanner;

public class arraymulti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Array Multi Dimensi");

        // MENYANTUMKAN BANYAK BARANG
        System.out.print("Masukkan Banyak Barang: ");
        int banyakbarang = s.nextInt();

        // MEMBUAT ARRAY 2 DIMENSI
        String[][] daftarbarang = new String[banyakbarang][2];

        // MEMASUKKAN NAMA DAN HARGA BARANG
        for (int i = 0; i < banyakbarang; i++) {
            System.out.print("Masukkan Nama Barang Ke-" + (i + 1) + ": ");
            daftarbarang[i][0] = s.next();

            System.out.print("Masukkan Harga Barang Ke-" + (i + 1) + ": ");
            daftarbarang[i][1] = s.next();
        }
        System.out.println("");

        // MENAMPILKAN DAFTAR BARANG
        System.out.println("Daftar Barang dan Harga: ");
        for (int i = 0; i < banyakbarang; i++) {
            System.out.println("Nama Barang: " + daftarbarang[i][0] + ", Harga: " + daftarbarang[i][1]);
        }
    }
}