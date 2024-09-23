package com.mycompany.agency;

// TODO 1: Make StaffEmployee a child of StaffMember
public class StaffEmployee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
                         String socSecNumber, double rate) {
        // Call the constructor of the parent class (StaffMember)
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: Complete the implementation of toString to return information 
    //         about a staff employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        // Call the parent class's toString and add the employee's social security number and pay rate
        return super.toString() + 
               "\nSocial Security Number: " + socialSecurityNumber + 
               "\nPay Rate: " + payRate;
    }

    //-----------------------------------------------------------------
    // TODO 4: Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return payRate;
    }
}
