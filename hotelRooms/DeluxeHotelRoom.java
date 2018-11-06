package hotelRooms;

import java.util.ArrayList;

import doors.SteelDoor;
import walls.WoodenWall;
import windows.SteelWindow;

public class DeluxeHotelRoom extends HotelRoom {

	@Override
	protected void setWalls() {
		// TODO Auto-generated method stub
		ArrayList<WoodenWall> woodenWalls = new ArrayList<WoodenWall>();
		for(int i=0; i<6; i++) woodenWalls.add(new WoodenWall());
		walls = woodenWalls;
	}

	@Override
	protected void setDoors() {
		// TODO Auto-generated method stub
		ArrayList<SteelDoor> steelDoors = new ArrayList<SteelDoor>();
		for(int i=0; i<2; i++) steelDoors.add(new SteelDoor());
		doors = steelDoors;
	}

	@Override
	protected void setWindows() {
		// TODO Auto-generated method stub
		ArrayList<SteelWindow> steelWindows = new ArrayList<SteelWindow>();
		for(int i=0; i<4; i++) steelWindows.add(new SteelWindow());
		windows = steelWindows;
	}

}
