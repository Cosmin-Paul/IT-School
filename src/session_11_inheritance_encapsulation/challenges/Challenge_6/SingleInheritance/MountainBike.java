package session_11_inheritance_encapsulation.challenges.Challenge_6.SingleInheritance;

public class MountainBike extends Bicycle {

    private String tireType;
    private String suspension;

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
}

