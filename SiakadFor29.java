import java.util.Scanner;

public class SiakadFor29 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        int mahalulus = 0, mahatidak = 0;

        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < 60) {
                mahatidak++;
            }
            if (nilai >= 60) {
                mahalulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + mahalulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + mahatidak);

        sc.close();
    }

}