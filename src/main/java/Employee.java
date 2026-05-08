public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;

    }

    public void punchTimeCard(int timeIn, int timeOut){
        int shiftHours;
        if (timeIn < 0 || timeIn > 23 || timeOut < 0 || timeOut > 23) {
            System.out.println("Invalid time. Please enter 0 - 23.");
            return;
        }


        if(timeIn<timeOut)
        {
            shiftHours=timeOut-timeIn;
        }
        else if(timeIn>timeOut){
            shiftHours=(24-timeIn)+timeOut;
        }
        else {
            shiftHours=0;
        }

        hoursWorked += shiftHours;
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