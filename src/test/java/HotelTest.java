import Room.RoomType;
import org.junit.Before;
import org.junit.Test;
import Guest.Guest;
import Room.*;

import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


public class HotelTest {
    private Hotel hotel;
    private ArrayList guest1 = new ArrayList();
    private Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Mediocre Inn");
        guest = new Guest();
        guest1.add(guest);


    }

    @Test
    public void canCreateBedroom(){
        hotel.createBedroom(1, RoomType.DOUBLE, 9.99f);
        assertEquals(1, hotel.getBedroms().size());
    }

    @Test
    public void canCheckIn(){
        hotel.createBedroom(1, RoomType.DOUBLE, 9.99f);
        hotel.checkinGuest(guest, 1);
//        Bedroom myRoom = hotel.getBedroomByNumber(1);
        assertEquals(1, hotel.guestsInRoomByRoomNumber(1));
    }
}
