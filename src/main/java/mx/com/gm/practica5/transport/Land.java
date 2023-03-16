package mx.com.gm.practica5.transport;

public class Land extends Transport {

    private int whelles;
    private String landType;

    public Land(int whelles, String landType, String fuel, String company, int speed, int peopleCapacity, double performance, String color) {
        super(fuel, company, speed, peopleCapacity, performance, color);
        this.whelles = whelles;
        this.landType = landType;
    }

    public int getWhelles() {
        return whelles;
    }

    public String getLandType() {
        return landType;
    }

    public void setWhelles(int whelles) {
        this.whelles = whelles;
    }

    public void setLandType(String landType) {
        this.landType = landType;
    }
    

    @Override
    public String toString() {
        return "whelles=" + whelles + ", landType=" + landType + ", performance= " + super.performance + ", peopleCapacity= " + super.peopleCapacity + ", speed= " + super.speed + ", company= " + super.company + ", fuel= " + super.fuel;
    }

}
