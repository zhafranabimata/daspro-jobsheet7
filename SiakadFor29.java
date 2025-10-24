import java.util.Scanner;

public class SiakadFor29 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.err.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }

}