package TugasPekan4;
import java.util.Scanner;
public class TugasAlproPekan4_2511531013 {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.print(" Masukkan Nama Pembeli : ");
		String NamaPembeli = keyboard.nextLine();
		System.out.print("Masukkan Jumlah Ticket yang ingin dipesan : ");
		int JumlahTicket = keyboard.nextInt();
		
		System.out.println("Jadwal reservasi ");
		System.out.println("1.Senin-Kamis");
		System.out.println("2.Jumat");
		System.out.println("3.Sabtu-Minggu ");
		System.out.print("Jadwal Reservasi yang dipilih  : ");
		int Hari= keyboard.nextInt();
		
		System.out.println("Waktu Tayang ");
		System.out.println("1.Pagi. 10:00-12:00");
		System.out.println("2.Siang. 12:00-17:00");
		System.out.println("3.Siang. 17:00-22:00 ");
		System.out.print("Waktu Tayang yang dipilih  : ");
		int WaktuTayang= keyboard.nextInt();
		
		System.out.println("Jenis Stuio");
		System.out.println("1.Regular");
		System.out.println("2.Deluxe");
		System.out.println("3.Premium ");
		System.out.print("Jenis Studio yang dipilih  : ");
		int JenisStudio= keyboard.nextInt();
		keyboard.close();
		
		int HargaDasar = 50000 ;
		double BiayaHari = 0.0;
		int BiayaStudio=0;
		double BiayaWaktu =0.0;
		int HargaperTicket=0;
		int Subtotal=0;
		int TotalBayar=0;
		int Diskon=0;
		int Diskonhari=0;
		
		String namaHari ="";
		switch(Hari) {
		case 1 :
			namaHari = "Senin-Kamis" ;
			BiayaHari=0.0;
			Diskonhari=10;
			break;
		case 2 :
			namaHari="Jumat";
			BiayaHari=0.10;
			Diskonhari=30;
			break;
		case 3 :
			namaHari="Sabtu-Minggu";
			BiayaHari=0.10;
			Diskonhari=0;
			break;
		default :
			namaHari="Tak tersedia";
		}
		
		String WaktuYangDipilih ="";
		switch(WaktuTayang) {
		case 1 :
			WaktuYangDipilih = "Pagi";
			BiayaWaktu =0.05;
			break;
		case 2 :
			WaktuYangDipilih = "Siang";
			BiayaWaktu = 0.10;
			break;
		case 3 :
			WaktuYangDipilih="Malam";
			BiayaWaktu = 0.15;
			break;
		default :
			WaktuYangDipilih="Tak tersedia";
		}
		String Studio ="";
		switch(JenisStudio) {
		case 1 :
			Studio = "Regular";
			BiayaStudio=0;
			break;
		case 2 :
			Studio ="Deluxe";
			BiayaStudio=10000;
			break;
		case 3 :
			Studio="Premium";
			BiayaStudio=30000;
			break;
		default :
			Studio="Tak tersedia";
		}
		
		System.out.println("=====PEMBELIAN TIKET BIOSKOP=====");
		System.out.println("Nama Pembeli     : " + NamaPembeli);
		System.out.println("Jumlah Ticket    : " + JumlahTicket);
		System.out.println("Hari             : " + namaHari);
		System.out.println("Waktu Tayang     : " + WaktuYangDipilih);
		System.out.println("Jenis Studio     : " + Studio);
		System.out.println("----------------------------------");
		System.out.println("Harga Dasar      : "+ HargaDasar + " /Tiket");

		
		System.out.println("Biaya Hari       : +" + (int)(BiayaHari*100)+"% ");
		System.out.println("Biaya Waktu      : +" + (int)(BiayaWaktu*100)+"%");
		BiayaHari=(BiayaHari* HargaDasar);
		BiayaWaktu=BiayaWaktu* HargaDasar;
		HargaperTicket=(HargaDasar)+=BiayaHari+=BiayaWaktu;
	
		System.out.println("Harga per Ticket : Rp"+ HargaperTicket);
		System.out.println("Biaya Studio     : Rp" + BiayaStudio);
		Subtotal= JumlahTicket * HargaperTicket +BiayaStudio ;
		System.out.println("Subtotal         : "+ Subtotal);
		Diskon=Subtotal*Diskonhari/100;
		System.out.println("Diskon "+Diskonhari +"%       : " + Diskon);
		System.out.println("----------------------------------");
		TotalBayar=Subtotal-Diskon;
		System.out.println("TOTAL BAYAR      : "+ TotalBayar);
	}

}