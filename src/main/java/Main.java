public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 150.00, false, false);
        System.out.println("Room beds: " + room1.getNumberOfBed());
        System.out.println("Room price: $" + room1.getPrice());
        System.out.println("Room occupied: " + room1.isOccupied());
        System.out.println("Room dirty: " + room1.isDirty());
        System.out.println("Room available: " + room1.isAvailable());

        System.out.println();

        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.println("Price per night: $" + reservation1.getPrice());
        System.out.println("Number of nights: " + reservation1.getNumberOfNights());
        System.out.println("Reservation total: $" + reservation1.getReservationTotal());

        System.out.println();

        Employee employee1 = new Employee(101, "Omor", "Front Desk", 20.00, 45);
        System.out.println("Employee name: " + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());
        System.out.println("Total pay: $" + employee1.getTotalPay());
    }
}