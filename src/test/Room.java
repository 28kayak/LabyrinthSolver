package test;


import java.awt.Color;
public class Room
{
	int locationx;
	int locationy;
	int roomId;
	boolean north;
	boolean east;
	boolean south;
	boolean west;
	Color floorCol;
	public Room()
	{
		
	}
	void setLocx(int locationx)
	{
		this.locationx = locationx;
	}
	void setLocy(int locationy)
	{
		this.locationy = locationy;
	}
	void setNorthRoom(boolean north)
	{
		this.north = north;
	}
	void setEastRoom(boolean east)
	{
		this.east = east;
	}
	void setWestRoom(boolean west)
	{
		this.west = west;
	}
	void setSouthRoom(boolean south)
	{
		this.south = south;
	}
	int[] getLocationbyRoom(int roomid)
	{
		int[] coordinate = new int[2];
		coordinate[0] = this.locationx;
		coordinate[1] = this.locationy;
		return coordinate;
	}
	int getRoombyLocation(int locationx, int locationy)
	{
		int returnedID;
		if(this.locationx == locationx && this.locationy == locationy)
		{
			returnedID = this.roomId;
		}
		else
		{
			returnedID = -1;
		}
		return returnedID;
	}
	void changeColor()
	{
		floorCol = Color.MAGENTA;
	}
	
	
	
	
	
	int getLocx()
	{
		return locationx;
	}
	int getLocy()
	{
		return locationy;
	}
	int roomId()
	{
		return roomId;
	}
	boolean getNorthRoom()
	{
		return north;
	}
	boolean getEastRoom()
	{
		return east;
	}
	boolean getSouthRoom()
	{
		return south;
	}
	boolean getWestRoom()
	{
		return west;
	}
	
}
