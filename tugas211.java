import java.util.Scanner;
public class tugas211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input11.nextLine().toLowerCase();
        
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input11.nextInt();

        double diskon = 0;  

        if (jenisBuku.equals("kamus")) {
            diskon = 10; 
            if (jumlahBuku > 2) {
                diskon += 2; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
        
            if (jumlahBuku > 3) {
                diskon = 5; 
            }
        }

        if (diskon > 0) {
            System.out.println("Diskon yang diberikan: " + diskon + "%");
        } else {
            System.out.println("Tidak ada diskon yang diberikan.");
        }

        input11.close();
    }
}
