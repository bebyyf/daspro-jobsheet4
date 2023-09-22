import java.util.Scanner;
public class kelompokgudang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int list_pemasukan_barang, list_pengeluaran_barang;
        double barangRestok, laporan_data;

        System.out.println("Masukkan jumlah barang awal:");
        list_pemasukan_barang = input.nextInt();
        System.out.println("Masukkan jumlah pengeluaran barang :");
        list_pengeluaran_barang = input.nextInt();

        laporan_data=list_pemasukan_barang-list_pengeluaran_barang;
        barangRestok=list_pengeluaran_barang;
        System.out.println("Jadi laporan barang yang perlu direstok adalah :"+barangRestok);
        System.out.println("Laporan data barang yang masih tersisa di gudang:"+laporan_data);



    }
}
