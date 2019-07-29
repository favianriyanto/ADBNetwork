import java.util.Scanner;

public class soal3 {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jumlah Barang = ");
		int jumlah = input.nextInt();
		
		System.out.print("Harga Barang = ");
		int harga = input.nextInt();
		
		int harga_barang = jumlah * harga;
		
		if ( harga_barang >= 1000000) {
			int potong = harga_barang*10/100;
			System.out.println("Harga yang harus dibayar = " + potong);
			
		}else if (harga_barang >= 501000 && harga_barang <= 1000000){
			int potong = harga_barang*5/100;
			System.out.println("Harga yang harus dibayar = " + potong);
		}else {
			int potong = harga_barang;
			System.out.println("Harga yang harus dibayar = " + potong);
		}
	}
}