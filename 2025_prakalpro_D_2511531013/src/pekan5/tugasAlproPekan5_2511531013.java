package TugasPekan5;

public class tugasAlproPekan5_2511531013 {

	public static void main(String[] args) {
		int k = 4;
		 
		System.out.print("#");
		for ( int i= 1; i<=k*4; i++) {
			System.out.print("=");
		}
		System.out.println("#");	
		for (int i= 1; i<=k; i++) {
			System.out.print("|");
			for (int l=1; l<=4-i; l++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int l=1; l<=(i-1)*4; l++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int l=1; l<= 4-i; l++) {
				System.out.print("  ");
			}
			System.out.println("|");
		}
		for (int i= k; i>=1; i--) {
			System.out.print("|");
			for (int l=1; l<=4-i; l++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int l=1; l<=(i-1)*4; l++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int l=1; l<= 4-i; l++) {
				System.out.print("  ");
			}
			System.out.println("|");
		}		
		System.out.print("#");
		for ( int i= 1; i<=k*4; i++) {
			System.out.print("=");
		}
		System.out.println("#");

	}

}
