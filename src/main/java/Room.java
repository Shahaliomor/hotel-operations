public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupide, boolean dirty){
        this.numberOfBeds=numberOfBeds;
        this.price=price;
        this.occupied= occupide;
        this.dirty=dirty;
    }

    public int getNumberOfBed() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable(){
        return !occupied && !dirty;
    }
    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room is not available.");
            return;
        }

        occupied = true;
        dirty = true;
    }

    public void checkOut() {
        occupied = false;
        dirty = true;
    }

    public void cleanRoom() {
        if (occupied) {
            return;
        }

        dirty = false;
    }
}
