package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
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
        return Math.min(hoursWorked, 40.0);
    }

    public double getOvertimeHours() {
        return Math.max(0.0, hoursWorked - 40.0);
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }
    public class Employee {
        String employeeName;
        double totalHoursWorked;
        double startWorkTime;

        // Create a new employee with a name
        public Employee(String employeeName) {
            this.employeeName = employeeName;
            this.totalHoursWorked = 0;
        }

        // Start a work shift
        public void punchIn(double time) {
            startWorkTime = time;
            System.out.println(employeeName + " started working at " + time + " o'clock.");
        }

        // End a work shift and calculate how long they worked
        public void punchOut(double time) {
            double hoursThisShift = time - startWorkTime;
            totalHoursWorked += hoursThisShift;
            System.out.println(employeeName + " stopped working at " + time + " o'clock. Worked " + hoursThisShift + " hours this shift.");
        }

        // Show how many hours the person has worked in total
        public double getTotalHours() {
            return totalHoursWorked;
        }
    }


}
