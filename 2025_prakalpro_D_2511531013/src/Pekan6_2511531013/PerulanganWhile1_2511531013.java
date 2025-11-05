package Pekan6_2511531013;

import java.util.Scanner;

public class PerulanganWhile1_2511531013 {
	public static void main(String[] args) {
		
		int counter=0;
		String jawab;
		boolean running=true;
		//deklarasi scanner
		Scanner scan= new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+ counter);
			System.out.println("Apakah Lanjut ( ya / tidak?)");
			jawab=scan.nextLine();
			//cek jawaban = tidak,perulangan berhenti
			if (jawab.equalsIgnoreCase("Tidak")) {
				running=false;
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+ counter +" kali");

	}

}
