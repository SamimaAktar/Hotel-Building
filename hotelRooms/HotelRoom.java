package hotelRooms;
import java.util.ArrayList;

import doors.Door;
import walls.Wall;
import windows.Window;

public abstract class HotelRoom {
	
	public ArrayList<? extends Wall> walls;
	public ArrayList<? extends Door> doors;
	public ArrayList<? extends Window> windows;
	
	public HotelRoom() {
		setWalls();
		setDoors();
		setWindows();
	}
	
	public void describe() {
		System.out.println(walls.get(0).getWallType());
		System.out.println(doors.get(0).getDoorType());
		System.out.println(windows.get(0).getWindowType());
	}
	
	protected abstract void setWalls();
	
	protected abstract void setDoors();
	
	protected abstract void setWindows();
}
