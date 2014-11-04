import Room;


public class Robot 
{
	enum directions{front, right, left, back,}
	//enum wall{oepned, closed,}
	private int locationX;
	private int locationY;
	private int roomId;
	private int heads;
	
	int getCurrentRoomID(int current_x, int current_y)
	{
		int current_id;
		current_id = current_x + 4*current_y;
		return current_id;
	}//getCurrentRoomID
	boolean[] getSensorValues()
	{//index represents the direction where the sensor supposes to be.
	// value corresponding index represents the detection of the walls.
	// if there is a wall, return t; otherwise, false
	// if door is opened, hold value is true; otherwise, false.
	//      1
	//8  (Robot)  2
	//      4
	//for the conventional direction.
		boolean sensorResult[] = new boolean[4];//Not use sensorResult[0] for intuitive
		
		 
		  
		return sensorResult;
	}//getSensorVal
	void setCurrentRoom()
	{//assume the instances of rooms has been allocated.
		boolean[] sensorValues = getSensorValues();
		//int currentRoomId = getCurrentRoomID();
		if(sensorValues[1] == true)
		{//if the head of robot is true(opened)
			//Room currentRoom = new Room();
			
			
			
			
		}
		else if(sensorValues[2] == true)
		{
			
		}
		else if(sensorValues[3] == true)
		{
			
		}
		else
		{
			//something goes wrong.
		}
		
		
		
		
	}//setCurrentRoom
	public boolean checkR()
	{
		return true;
	}//checkR
	public void turnRight()
	{
		this.heads = this.heads*2;
		if(this.heads == 16)
		{
			this.heads = 1;
		}
	}
	public void goStraight()
	{
		switch(this.heads)
		{
		 	case 1://up
		 		this.locationY = this.locationY+1;
		 		break;
		 	case 2://right
		 		this.locationX += 1;
		 		break;
		 	case 4:
		 		this.locationY -= 1;
		 		break;
		 	case 8:
		 		this.locationX -= 1;
		 		break;
		}
	}
	public int getRoomId()
	{
		return this.locationX + 5*this.locationY;
	}
	public boolean getSensorR(Room[] rooms)
	{
		int index = this.getRoomId();
		boolean result = false;
		switch(this.heads)
		{
			case 1:
				result = rooms[index].east;
				break;
			case 2:
				result = rooms[index].south;
				break;
			case 4:
				result = rooms[index].west;
				break;
			case 8:
				result = rooms[index].north;
				break;
		}//switch
		return result;
	}//getSensorR()
	public boolean getSensorF(Room[] rooms)
	{
		int index = this.getRoomId();
		boolean result = false;
		switch(this.heads)
		{
			case 1:
				result = rooms[index].north;
				break;
			case 2:
				result = rooms[index].east;
				break;
			case 4:
				result = rooms[index].south;
				break;
			case 8:
				result = rooms[index].west;
		}
		return result;
	}
	
	
}
