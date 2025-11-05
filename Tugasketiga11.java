import java.util.Scanner;

public class Tugasketiga11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String pesanan[] = new String[jumlahPesanan];
        int harga[] = new int[jumlahPesanan];
        int totalBiaya = 0;
        boolean adaPesanan = false;

        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan Nama Pesanan ke-" + (i + 1) + ": ");
            pesanan[i] = sc.nextLine().trim();
            
            System.out.print("Masukkan Harga Pesanan ke-" + (i + 1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < pesanan.length; i++) {
            totalBiaya += harga[i];
        }
        System.out.println();
        System.out.println("Daftar Pesanan: ");
        for (int i = 0; i < pesanan.length; i++) {
        System.out.println( (i + 1) + ". " + pesanan[i] + " Rp" + harga[i]);
        }
        System.out.print("Masukkan Nama Makanan yang ingin dicari: ");
        String namaMakanan = sc.nextLine().trim();
        for (int i = 0; i < pesanan.length; i++) {
            if (pesanan[i].equalsIgnoreCase(namaMakanan)) {
                adaPesanan = true;
                break;
            }
        }
        if (adaPesanan) {
            System.out.println("Makanan atau Minuman " + namaMakanan + " tersedia di menu.");
        } else {
            System.out.println("Makanan atau Minuman " + namaMakanan + " tidak tersedia di menu.");
        }
    }
}
    

