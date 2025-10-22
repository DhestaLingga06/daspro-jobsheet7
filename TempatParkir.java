import java.util.Scanner;
public class TempatParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jenis, durasi; // jenis kendaraan dan durasi parkir kendaraan
        double total = 0; // total pembayaran semua kendaraan 

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) { //Jika 0, maka program selesai 
                System.out.println("Program selesai.");
                break; 
            }

            if (jenis != 1 && jenis != 2) { //Jika selain 1 dan 2 maka salah atau kendaraan tidak dikenali.
                System.out.println("Jenis kendaraan tidak dikenali. ");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500; // Harga tetap jika parkir lebih dari 5 jam
            } else if (jenis == 1) { // mobil
                total += durasi * 3000; // Tarif parkir mobil per jam
            } else if (jenis == 2) { // motor
                total += durasi * 2000; // Tarif parkir motor per jam
            }
            
            System.out.println("Total sementara: Rp " + total);
        }

        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
        sc.close();
    }
}