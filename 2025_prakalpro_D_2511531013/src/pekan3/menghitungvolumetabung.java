package tugaspekan3;
import java.util.Scanner;
public class menghitungvolumetabung {
	public static void main(String[] args) {
		float a;
		float b;
		float VolumeTabung;
		float phi=3.14f;
		Scanner keyboard = new Scanner (System.in);
	    System.out.print("input r atau jari-jari Tabung: ");
	    a = keyboard.nextFloat();
	    System.out.print("input t atau tinggi Tabung   : ");
	    b = keyboard.nextFloat();
	    keyboard.close();
	    System.out.println("Rumus Volume Tabung : phi * r * r * t ");
        VolumeTabung = phi * a * a * b;
        System.out.println("Volume Tabung Adalah = " + VolumeTabung);
	}
}
