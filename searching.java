import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String barang[] = { "Celana", "Kaos", "Kemeja", "Laptop", "Handphone", "Panci", "Tumbler" };
        boolean ketemu;
        int i, pilih = 1;
        do {
            System.out.println("Quiz Searching");
            System.out.print("Pencarian Barang : ");
            for (i = 0; i < barang.length; i++) {
                System.out.print(barang[i] + " ");
            }
            ketemu = false;
            System.out.println("");
            System.out.print("Cari Barang : ");
            String cari = s.next();
            for (i = 0; i < barang.length; i++) {
                if (barang[i].compareToIgnoreCase(cari) == 0) {
                    ketemu = true;
                    break;
                }
            }
            if (ketemu == true) {
                System.out.println("Ada di nomor ke- " + (i + 1));
            } else {
                System.out.println("Barang Tidak Ada di list");
            }
            System.out.println("Ingin cari lagi ?");
            System.out.println("1. Ya\n2. Tidak");
            pilih = s.nextInt();
            System.out.println("");
        } while (pilih == 1);
        System.out.println("Terima Kasih");
    }
}