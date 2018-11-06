package hotelRooms;

import java.util.ArrayList;

import doors.SteelDoor;
import doors.WoodenDoor;
import walls.BrickWall;
import walls.WoodenWall;
import windows.SteelWindow;
import windows.WoodenWindow;

public class RegularHotelRoom extends HotelRoom {

	@Override
	protected void setWalls() {
		// TODO Auto-generated method stub
		ArrayList<BrickWall> brickWalls = new ArrayList<BrickWall>();
		for(int i=0; i<6; i++) brickWalls.add(new BrickWall());
		walls = brickWalls;
	}

	@Override
	protected void setDoors() {
		// TODO Auto-generated method stub
		ArrayList<WoodenDoor> woodenDoors = new ArrayList<WoodenDoor>();
		for(int i=0; i<2; i++) woodenDoors.add(new WoodenDoor());
		doors = woodenDoors;
	}

	@Override
	protected void setWindows() {
		// TODO Auto-generated method stub
		ArrayList<WoodenWindow> woodenWindows = new ArrayList<WoodenWindow>();
		for(int i=0; i<4; i++) woodenWindows.add(new WoodenWindow());
		windows = woodenWindows;
	}

}
