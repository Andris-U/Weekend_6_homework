import java.util.ArrayList;
import Room.*;
import Guest.*;

public class Hotel {
    private String property;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String property){
        this.property = property;
        this.bedrooms = new ArrayList<Bedroom>();
    }

    public ArrayList getBedroms(){
        return bedrooms;
    }

    public Bedroom getBedroomByNumber(int number){
        for(Bedroom room : bedrooms){
            if(room.getRoomNumber() == number){
                return room;
            }
        }
        return null;
    }

    public void createBedroom(int number, RoomType type, float rate){
        Bedroom bedroom = new Bedroom(number, type, rate);
        bedrooms.add(bedroom);
    }

    public int getTotalRoomsByType(RoomType roomType){
        int total = 0;
        for(Bedroom room : bedrooms){
            if(room.getRoomType() == roomType){
                total++;
            }
        }
        return total;
    }

    public void checkinGuest(Guest guest, int number){
        Bedroom bedroom = getBedroomByNumber(number);
        RoomType roomType = bedroom.getRoomType();
        if(getTotalRoomsByType(roomType) < roomType.getTotal()){
            bedroom.addGuestToRoom(guest);
        }
    }

    public int guestsInRoomByRoomNumber(int roomNumber){
        for(Bedroom room : bedrooms){
            if(room.getRoomNumber() == roomNumber){
                return room.getGuestsInRoom().size();
            }
        }
        return 0;
    }
}
