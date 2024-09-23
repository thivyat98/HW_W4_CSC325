package com.mycompany.agency;

// TODO 1: Make TempEmployee a child of StaffEmployee
public class TempEmployee extends StaffEmployee {
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
                        String socSecNumber, double rate) {
        // Call the constructor of the parent class (StaffEmployee)
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO 2: Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // TODO 3: Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        // Return pay based on rate and hours worked
        double pay = payRate * hoursWorked;
        hoursWorked = 0; // Reset hours after pay
        return pay;
    }

    //-----------------------------------------------------------------
    // TODO 4: Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        // Return employee information using the parent class's toString method
        return super.toString() + "\nHours worked: " + hoursWorked;
    }
}
