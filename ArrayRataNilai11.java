import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        int[] nilaiMhs = new int [10];
        int lulus = 0;
        double total = 0;
        double rataLulus;
        double rataTidakLulus;
        int totalNilaiLulus = 0;
        int totalNilaiTidakLulus = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) { //modifikasi
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        for(int i = 0; i < nilaiMhs.length; i++) { //modifikasi kedua
            if(nilaiMhs[i] > 70) {
                totalNilaiLulus += nilaiMhs[i];
            } else {
                totalNilaiTidakLulus += nilaiMhs[i];
            }
        }
        rataLulus = totalNilaiLulus/lulus;
        rataTidakLulus = totalNilaiTidakLulus/(nilaiMhs.length - lulus);

                
    System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
    System.out.println("Rata-rata Nilai Lulus: " + rataLulus);
    System.out.println("Rata-rata Nilai Tidak Lulus: " + rataTidakLulus);

    }
    
}
