import java.util.Scanner;
public class quizpraktek {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		char merek, tipe;
		int jum, bayar, total, kembali,harga;
		String nama;
		
		harga=(0);
		
		System.out.print("Silahkan menginput nama anda: ");
		nama = input.nextLine();
		System.out.println();
		
		System.out.println("Merek yang tersedia: ");
		System.out.println("G");
		System.out.println("O");
		System.out.print("Pilihan anda? ");
		merek = input.next().charAt(0);
		System.out.println();
		
		switch(merek) {
			case ('g'):
				System.out.println("Dibawah ini adalah tipenya: ");
				System.out.println("Meja(M) - Rp.95,000");
				System.out.println("Kursi(K) - Rp.125,000");
				System.out.println("Lemari(L) - Rp.450,000");
				System.out.print("Pilihan anda? (Masukkan kode tipe) ");
				tipe = input.next().charAt(0);
					switch(tipe) {
						case('m'):
							harga=95000;
							System.out.print("Masukkan jumlah yang ingin dibeli: ");
							jum=input.nextInt();
							System.out.println();
							total = jum*harga;
							System.out.println("Total pembayaran kamu adalah: Rp."+total);
							System.out.print("Masukkan uang anda: ");
							bayar=input.nextInt();
							System.out.println();
		
							kembali=bayar-total;
							System.out.println("Total kembalian mu adalah: Rp."+kembali);
						break;
						case('k'):
							harga=125000;
							System.out.print("Masukkan jumlah yang ingin dibeli: ");
							jum=input.nextInt();
							System.out.println();
							total = jum*harga;
							System.out.println("Total pembayaran kamu adalah: Rp."+total);
							System.out.print("Masukkan uang anda: ");
							bayar=input.nextInt();
							System.out.println();
		
							kembali=bayar-total;
							System.out.println("Total kembalian mu adalah: Rp."+kembali);
						break;
						case('l'):
							harga=450000;
							System.out.print("Masukkan jumlah yang ingin dibeli: ");
							jum=input.nextInt();
							System.out.println();
							total = jum*harga;
							System.out.println("Total pembayaran kamu adalah: Rp."+total);
							System.out.print("Masukkan uang anda: ");
							bayar=input.nextInt();
							System.out.println();
		
							kembali=bayar-total;
							System.out.println("Total kembalian mu adalah: Rp."+kembali);
						break;
					}
			break;
			case('o'):
				System.out.println("Dibawah ini adalah tipenya: ");
				System.out.println("Meja(M) - Rp.115,000");
				System.out.println("Kursi(K) - Rp.135,000");
				System.out.println("Lemari(L) - Rp.550,000");
				System.out.print("Pilihan anda? "); 
				tipe = input.next().charAt(0);
					switch(tipe) {
						case('m'):
							harga=115000;
							System.out.print("Masukkan jumlah yang ingin dibeli: ");
							jum=input.nextInt();
							System.out.println();
							total = jum*harga;
							System.out.println("Total pembayaran kamu adalah: Rp."+total);
							System.out.print("Masukkan uang anda: ");
							bayar=input.nextInt();
							System.out.println();
		
							kembali=bayar-total;
							System.out.println("Total kembalian mu adalah: Rp."+kembali);
						break;
						case('k'):
							harga=135000;
							System.out.print("Masukkan jumlah yang ingin dibeli: ");
							jum=input.nextInt();
							System.out.println();
							total = jum*harga;
							System.out.println("Total pembayaran kamu adalah: Rp."+total);
							System.out.print("Masukkan uang anda: ");
							bayar=input.nextInt();
							System.out.println();
		
							kembali=bayar-total;
							System.out.println("Total kembalian mu adalah: Rp."+kembali);
						break;
						case('l'):
							harga=550000;
							System.out.print("Masukkan jumlah yang ingin dibeli: ");
							jum=input.nextInt();
							System.out.println();
							total = jum*harga;
							System.out.println("Total pembayaran kamu adalah: Rp."+total);
							System.out.print("Masukkan uang anda: ");
							bayar=input.nextInt();
							System.out.println();
		
							kembali=bayar-total;
							System.out.println("Total kembalian mu adalah: Rp."+kembali);
						break;
					}
			break;
			default:
				System.out.println("Merek diatas tidak tersedia");
			break;	
		}
	}
}