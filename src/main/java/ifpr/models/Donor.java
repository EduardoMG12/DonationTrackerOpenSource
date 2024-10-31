package ifpr.models;


public class Donor {
    private int id;
    private String name;
    private double totalDonated;

    public Donor(int id, String name, double totalDonated) {
        this.id = id;
        this.name = name;
        this.totalDonated = totalDonated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalDonated(double totalDonated) {
        this.totalDonated = totalDonated;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTotalDonated() {
        return totalDonated;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalDonated=" + totalDonated +
                '}';
    }
}