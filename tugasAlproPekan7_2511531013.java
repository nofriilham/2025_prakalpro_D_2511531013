package pekan7_2511531013;
import java.util.Scanner;
public class tugasAlproPekan7_2511531013{

	public static void main(String[] args) {
  Akun_2511531013 a = new Akun_2511531013();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("===== REGISTRASI AKUN BARU =====");
		System.out.print ("Masukkan Username : ");
		String username=input.nextLine();
		System.out.print ("Masukkan Password: ");
		String password=input.nextLine();
		System.out.print ("Masukkan Email: ");
		String email=input.nextLine();
		System.out.print ("Masukkan PIN(6 digit): ");
		int n=input.nextInt();
		int pin=n+10;
		String pins=Integer.toString(n)+10;
		
a.setusername(username);
a.setpassword(password);
a.setemail(email);
a.setPinAngka(pin);

if ((a.isPasswordValid())&&(a.isEmailValid())) {
			System.out.println("\n--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \""+a.username()+"\" telah berhasil dibuat.");
System.out.println("\n--- DETAIL AKUN ---");
			System.out.println("Username (Lowercase)\t: "+a.username().toLowerCase());
		System.out.println("Email (Uppercase)\t: "+a.email().toUpperCase());
System.out.println("ID Pengguna (Gabungan)\t: "+a.username()+a.getPinAngka());
			System.out.println("\n--- Uji Tipe Data (PIN Anda: "+a.getPinAngka()+") ---");
System.out.println("PIN (int) + 10\t\t= "+pin);
			System.out.println("PIN (string) + 10\t= "+pins);
		} else if (!a.isPasswordValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
System.out.println("Password Anda kurang dari 8 karekter! \nSilahkan Coba Lagi.");
		} else if (!a.isEmailValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
System.out.println("Email Anda \""+a.email()+"\" tidak valid! (harus mengandung '@' dan '.') \nSilahkan Coba Lagi.");
		}
		input.close();

	}
		
}