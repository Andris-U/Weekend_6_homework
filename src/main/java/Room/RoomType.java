package Room;

public enum RoomType {
    DOUBLE(10, 2),
    TWO_DOWBLE(5, 4),
    SUITE(2, 2);

    private final int total;
    private final int capacity;

    RoomType(int total, int capacity) {
        this.total = total;
        this.capacity = capacity;
    }

    public int getTotal(){
        return total;
    }

    static int getTotalRooms() {
        int total = 0;
        for(RoomType roomType : RoomType.values()){
            total += roomType.total;
        }
        return total;
    }

}
