package hotelRooms;

import java.util.ArrayList;

import doors.SlidingDoor;
import walls.GlassWall;
import walls.Wall;
import windows.SlidingWindow;

public class LuxuriousHotelRoom extends HotelRoom {

	@Override
	protected void setWalls() {
		// TODO Auto-generated method stub
		ArrayList<GlassWall> glassWalls = new ArrayList<GlassWall>();
		for(int i=0; i<6; i++) glassWalls.add(new GlassWall());
		walls = glassWalls;
	}

	@Override
	protected void setDoors() {
		// TODO Auto-generated method stub
		ArrayList<SlidingDoor> slidingDoors = new ArrayList<SlidingDoor>();
		for(int i=0; i<2; i++) slidingDoors.add(new SlidingDoor());
		doors = slidingDoors;
	}

	@Override
	protected void setWindows() {
		// TODO Auto-generated method stub
		ArrayList<SlidingWindow> slidingWindows = new ArrayList<SlidingWindow>();
		for(int i=0; i<4; i++) slidingWindows.add(new SlidingWindow());
		windows = slidingWindows;
	}

}
