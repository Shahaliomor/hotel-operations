public class Main {
    public static void main(String[] args) {

        // ROOM TESTING
        Room room1 = new Room(2, 150.00, false, false);

        System.out.println("========== ROOM TEST ==========");
        System.out.println("Room beds: " + room1.getNumberOfBed());
        System.out.println("Room price: $" + room1.getPrice());
        System.out.println("Room occupied: " + room1.isOccupied());
        System.out.println("Room dirty: " + room1.isDirty());
        System.out.println("Room available: " + room1.isAvailable());

        System.out.println();

        room1.checkIn();

        System.out.println("After check in:");
        System.out.println("Room occupied: " + room1.isOccupied());
        System.out.println("Room dirty: " + room1.isDirty());
        System.out.println("Room available: " + room1.isAvailable());

        System.out.println();

        room1.checkOut();

        System.out.println("After check out:");
        System.out.println("Room occupied: " + room1.isOccupied());
        System.out.println("Room dirty: " + room1.isDirty());
        System.out.println("Room available: " + room1.isAvailable());

        System.out.println();

        room1.cleanRoom();

        System.out.println("After cleaning:");
        System.out.println("Room occupied: " + room1.isOccupied());
        System.out.println("Room dirty: " + room1.isDirty());
        System.out.println("Room available: " + room1.isAvailable());

        System.out.println();


        // RESERVATION TESTING
        System.out.println("====== RESERVATION TEST ======");

        Reservation reservation1 = new Reservation("king", 3, true);

        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.println("Price per night: $" + reservation1.getPrice());
        System.out.println("Number of nights: " + reservation1.getNumberOfNights());
        System.out.printf("Reservation total: $%.2f%n",
                reservation1.getReservationTotal());

        System.out.println();


        // EMPLOYEE TESTING
        System.out.println("======== EMPLOYEE TEST ========");

        Employee employee1 =
                new Employee(101, "Omor", "Front Desk", 20.00);

        // Using punchTimeCard bonus method
        employee1.punchTimeCard(9, 17);
        employee1.punchTimeCard(10, 18);
        employee1.punchTimeCard(14, 22);
        employee1.punchTimeCard(22, 7);
        employee1.punchTimeCard(9, 17);

        // Using overloaded punchIn/punchOut
        employee1.punchIn(8);
        employee1.punchOut(12);

        System.out.println("Employee name: " + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Hours worked: " + employee1.getHoursWorked());
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());
        System.out.printf("Total pay: $%.2f%n",
                employee1.getTotalPay());

        System.out.println();


        // HOTEL TESTING
        System.out.println("========== HOTEL TEST ==========");

        Hotel hotel1 = new Hotel("Expense Ninja Hotel", 5, 20);

        System.out.println("Hotel name: " + hotel1.getName());
        System.out.println("Available suites: "
                + hotel1.getAvailableSuites());
        System.out.println("Available basic rooms: "
                + hotel1.getAvailableRooms());

        System.out.println();

        boolean bookedSuite = hotel1.bookRoom(2, true);

        if (bookedSuite) {
            System.out.println("2 suites booked successfully.");
        } else {
            System.out.println("Unable to book suites.");
        }

        boolean bookedRoom = hotel1.bookRoom(3, false);

        if (bookedRoom) {
            System.out.println("3 basic rooms booked successfully.");
        } else {
            System.out.println("Unable to book basic rooms.");
        }

        System.out.println();

        System.out.println("Available suites after booking: "
                + hotel1.getAvailableSuites());

        System.out.println("Available basic rooms after booking: "
                + hotel1.getAvailableRooms());
    }
}