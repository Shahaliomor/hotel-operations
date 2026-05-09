import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void punchInAndPunchOut_ShouldCalculateSameDayHours() {

        Employee employee =
                new Employee(101, "Omor", "Front Desk", 20.00);

        employee.punchIn(9);
        employee.punchOut(17);

        assertEquals(8, employee.getHoursWorked());
    }

    @Test
    void punchInAndPunchOut_ShouldCalculateOvernightHours() {

        Employee employee =
                new Employee(101, "Omor", "Front Desk", 20.00);

        employee.punchIn(22);
        employee.punchOut(7);

        assertEquals(9, employee.getHoursWorked());
    }

    @Test
    void punchInAndPunchOut_ShouldAddMultipleShifts() {

        Employee employee =
                new Employee(101, "Omor", "Front Desk", 20.00);

        employee.punchIn(9);
        employee.punchOut(17);

        employee.punchIn(10);
        employee.punchOut(18);

        assertEquals(16, employee.getHoursWorked());
    }
}