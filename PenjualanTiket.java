
import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        double hargatik = 50000, totalHarga, totalPenjualan = 0;
        int jmltiket, totalTiket = 0;
        String pelang;
        char jawab;

        Scanner sc = new Scanner(System.in);

        System.out.println("=========TRANSAKASI HARI INI==========");

        do { 
            System.out.print("Masukkan Nama Pelanggan: ");
            pelang = sc.nextLine();

            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jmltiket = sc.nextInt();

            if (jmltiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.\n");
                sc.nextLine();
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

            System.out.println("===STRUK PEMBELIAN TIKET===" );
            System.out.println("Pembelian Atas Nama : " + pelang + " \nTotal Harga Untuk pembelian ini : Rp. " +totalHarga );
            System.out.print("\nLanjut Transaksi berikutnya(y) atau Selesaikan Transaksi Hari ini?(n) (y/n): ");
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
