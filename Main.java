import hotelRooms.HotelRoom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receptionist r = new Receptionist();
		HotelRoom lhr = r.bookHotelRoom("LUXURIOUS");
		HotelRoom dhr = r.bookHotelRoom("Deluxe");
		HotelRoom rhr = r.bookHotelRoom("regular");
		
		lhr.describe();
		System.out.println();
		dhr.describe();
		System.out.println();
		rhr.describe();
	}

}
