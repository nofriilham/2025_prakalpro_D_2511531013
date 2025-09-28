package pekan2;

public class TugasPekan2 {

	public static void main(String[] args) {
		int jumlahkamar = 60;                  
        float ratinghotel = 4.5f ;              
        char kelashotel = 'A';               
        boolean tersedia = true; 
        
        System.out.println("=== Informasi hotel ===");
        System.out.println("Jumlah Kamar          : " + jumlahkamar);
        System.out.println("RatingHotel           : " + ratinghotel);
        System.out.println("KelasHotel            : " + kelashotel);
        System.out.println("Tersedia              : " + tersedia);

        if (tersedia) {
        	System.out.println("Hotel ini tersedia untuk di Booking"); 
        	} else {
            System.out.println("Hotel ini tak tersedia untuk di Booking");
        	}
    }


}


