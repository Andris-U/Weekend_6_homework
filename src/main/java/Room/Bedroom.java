package Room;
import Guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNumber;
    private RoomType roomType;
    private float rate;

    public Bedroom(int roomNumber, RoomType roomType, float rate) {
        super();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rate = rate;
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public ArrayList getGuestsInRoom(){
        return guests;
    }

    public void addGuestToRoom(Guest guest){
        guests.add(guest);
    }
}
