import java.util.Scanner;
public class HargaBayar21 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String merek;
        int harga, jumlah,jmlhalaman;
        double dis,total, bayar, jmlDis;

        System.out.println("Masukkan harga barang yang dibeli:  ");
        harga= input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli:  ");
        jumlah=input.nextInt();
        input.nextLine();
        System.out.println("Masukkan merk buku yang dibeli:  ");
        merek=input.nextLine();
        System.out.println("Masukkan jumlah halaman yang dibeli:  ");
        jmlhalaman=input.nextInt();
        System.out.println("Masukkan jumlah diskon:  ");
        dis=input.nextDouble();
        
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah:  "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adlaah:   "+bayar);
    }
}
