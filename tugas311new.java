import java.util.Scanner;
public class tugas311new {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga;

        System.out.println("Masukkan Merk Sepatu (Specs/910/Ortus): ");
        merk = input11.nextLine();
        System.out.println("Masukkan kategori sepatu (Slip On/High Top / Woman/Man / Kids/Adult): ");
        kategori = input11.nextLine();
        System.out.println("Masukkan ukuran sepatu : ");
        ukuran = input11.nextInt();

        if (merk.equalsIgnoreCase("Specs") && kategori.equalsIgnoreCase("Slip On")) {
            if (ukuran >= 36 && ukuran <= 40) {
                harga = 800_000;
                System.out.println("Jadi kategori " + kategori + " dengan harga " + harga);    
            }
        }
            else if (merk.equalsIgnoreCase("Specs") && kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40 && ukuran <= 44) {

                    harga = 1_200_000;
                    System.out.println("Jadi kategori " + kategori + " dengan harga " + harga);
                }
            }
            else if (merk.equalsIgnoreCase("910") && kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {

                    harga = 1_000_000;
                    System.out.println("Jadi kategori " + kategori + " dengan harga " + harga);
                }
            }
            else if (merk.equalsIgnoreCase("910") && kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {

                    harga = 1_800_000;
                    System.out.println("Jadi kategori " + kategori + " dengan harga " + harga);
                }
            }
            else if (merk.equalsIgnoreCase("Ortus") && kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {

                    harga = 750_000;
                    System.out.println("Jadi kategori " + kategori + " dengan harga " + harga);
                }
            }
            else if (merk.equalsIgnoreCase("Ortus") && kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {

                    harga = 1_500_000;
                    System.out.println("Jadi kategori " + kategori + " dengan harga " + harga);
                }
            } else {
                System.out.println("Data Sepatu Invalid");
            }
        }

    }