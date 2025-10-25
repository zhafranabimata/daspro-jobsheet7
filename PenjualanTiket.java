
import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        double hargatik = 50000, totalHarga, totalPenjualan = 0;
        int jmltiket, totalTiket = 0;
        String pelang;
        char jawab;

        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar): ");
            pelang = sc.nextLine();
            if (pelang.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;    
            }

            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jmltiket = sc.nextInt();

            if (jmltiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.\n");
                continue;
            }

            double diskon = 0;
            if (jmltiket > 10) {
                diskon = 0.15;
            } else if (jmltiket> 4) {
                diskon = 0.10;
            }

            totalHarga = jmltiket * hargatik * (1 - diskon);
            totalTiket += jmltiket;
            totalPenjualan += totalHarga;

            System.out.println("Pembelian Atas Nama : " + pelang + " \nTotal Harga Untuk pembelian ini : Rp. " +totalHarga );
            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            jawab = sc.next().charAt(0);
            sc.nextLine();
            
            if (jawab == 'n' || jawab == 'N') {
                break;
            }
    
        } while (true);

        System.out.println("\nPENJUALAN HARI INI");
        System.out.println("Total tiket terjual hari ini : " + totalTiket);
        System.out.println("Total penjualan hari ini : Rp. " + totalPenjualan);

        sc.close();
    }

}