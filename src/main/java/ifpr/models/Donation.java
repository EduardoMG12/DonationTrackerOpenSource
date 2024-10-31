package ifpr.models;

import java.time.LocalDate;

public class Donation {
    private int id;
    private Donor donor;
    private double amount;
    private LocalDate date;

    public Donation(int id, Donor donor, double amount, LocalDate date) {
        this.id = id;
        this.donor = donor;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
