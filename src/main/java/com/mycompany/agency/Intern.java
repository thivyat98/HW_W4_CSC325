package com.mycompany.agency;

// TODO 1: Make Intern a child of StaffEmployee
public class Intern extends StaffEmployee {

    //-----------------------------------------------------------------
    //  Constructor: Sets up this intern using the specified information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone) {
        // Since interns don't have a social security number or pay rate, we pass default values
        super(eName, eAddress, ePhone, "N/A", 0.0); // social security number as "N/A" and pay rate as 0.0
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        // Interns have no pay, so always return 0.0
        return 0.0;
    }
}
