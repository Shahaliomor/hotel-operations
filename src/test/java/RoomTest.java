import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void checkIn_ShouldMakeRoomOccupideAndDirty() {

        Room room = new Room(2, 150.00, false, false);

        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    void checkOut_ShouldMakeRoomNotOccupideButDirty(){
        Room room = new Room(2, 150.00, false, false);

        room.checkIn();
        room.checkOut();

        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    void cleanRoom_ShouldNotCleanOccupiedRoom(){
        Room room = new Room(2, 150.00, true, true);
        room.cleanRoom();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }




}