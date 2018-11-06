import hotelRooms.DeluxeHotelRoom;
import hotelRooms.HotelRoom;
import hotelRooms.LuxuriousHotelRoom;
import hotelRooms.RegularHotelRoom;

public class Receptionist {
	
	public HotelRoom bookHotelRoom(String hotelType) {
		if(hotelType.toLowerCase().equals("luxurious")) {
			return new LuxuriousHotelRoom();
		}
		else if (hotelType.toLowerCase().equals("deluxe")) {
			return new DeluxeHotelRoom();
		}
		else if (hotelType.toLowerCase().equals("regular")) {
			return new RegularHotelRoom();
		}
		
		return null;
	}
}
