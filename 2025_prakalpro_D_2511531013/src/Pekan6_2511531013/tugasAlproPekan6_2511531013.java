package Pekan6_2511531013;
import java.util.Scanner;
import java.util.Random;

public class tugasAlproPekan6_2511531013 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        int target = 7; // nilai yang harus dicapai
        int jumlahCoba = 0;
        boolean menang = true;
        String jawab;

        while (menang) {
            jumlahCoba++;

            int daduA = rand.nextInt(6) + 1;
            int daduB = rand.nextInt(6) + 1;
            int total = daduA + daduB;
            
            System.out.println( daduA + " + " + daduB + " = " + total);

            if (total == target) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda benar setelah " + jumlahCoba + " kali percobaan! ");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                jawab = console.nextLine();
                
                if (jawab.equalsIgnoreCase("tidak")) {
                    menang = false;
                }
            }
        }

        if (!menang) {
            System.out.println("Anda gagal menang");
        }

        console.close();
    }
}
  
