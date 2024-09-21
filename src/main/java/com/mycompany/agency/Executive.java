package com.mycompany.agency;


// TODO 1: Make Executive a child of StaffEmploee
public class Executive extends StaffEmployee
{
    private double bonus;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this executive with the specified
    //  information.
    //-----------------------------------------------------------------
    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded
    }

    //-----------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus(double execBonus)
    {
        bonus = execBonus;
    }

    //-----------------------------------------------------------------
    // TODO2:  Computes and returns the pay for an executive, which is the
    //  regular employee payment plus a one-time bonus.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        double payment = super.pay();  // Get regular payment from StaffEmployee
        payment += bonus;  // Add the bonus to the regular payment
        bonus = 0;  // Reset bonus after it is paid
        return payment;
    }
}

