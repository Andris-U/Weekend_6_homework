import Room.RoomType;
import org.junit.Before;
import org.junit.Test;
import Room.Bedroom;
import Guest.*;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom room;
    private Guest guest;

    @Before
    public void before(){
        room = new Bedroom(1, RoomType.DOUBLE, 9.99f);
        guest = new Guest();
    }

    @Test
    public void canAddGuestToRoom(){
        room.addGuestToRoom(guest);
        assertEquals(1, room.getGuestsInRoom().size());
    }
}
