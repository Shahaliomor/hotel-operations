import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int punchInTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public void punchIn(int time) {
        punchInTime = time;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        punchInTime = now.getHour();
    }

    public void punchOut(int time) {
        int shiftHours;

        if (punchInTime < time) {
            shiftHours = time - punchInTime;
        } else if (punchInTime > time) {
            shiftHours = (24 - punchInTime) + time;
        } else {
            shiftHours = 0;
        }

        hoursWorked += shiftHours;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int timeOut = now.getHour();

        punchOut(timeOut);
    }

    public void punchTimeCard(int timeIn, int timeOut) {
        punchIn(timeIn);
        punchOut(timeOut);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}