import java.util.Scanner;
public class TiketBioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        double totalHarga, hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) { //Jika jumlah tiket negatif
                System.out.println("Jumlah tiket tidak valid! ");
                continue;
            }

            if (jumlahTiket == 0) { // Jika mengetik 0, maka program akan behenti
                System.out.println("Program selesai.");
                break;             
            }
            //Hitung total harga tanpa diskon
            totalHarga = jumlahTiket * hargaTiket;

            // Mengecek apakah mendapat diskon
            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
                System.out.println("Anda mendapat diskon 15% ");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
                System.out.println("Anda mendapat diskon 10% ");
            }
            // Total harga setelah dapat diskon
            System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah Rp " + totalHarga );
        }
        sc.close();

    }
}