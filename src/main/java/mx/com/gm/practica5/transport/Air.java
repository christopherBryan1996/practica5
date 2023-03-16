package mx.com.gm.practica5.transport;

public class Air extends Transport{
    private String wingType;
    private String landingType;
    private String tuition;

    public Air(String wingType, String landingType, String tuition, String fuel, String company, int speed, int peopleCapacity, double performance, String color) {
        super(fuel, company, speed, peopleCapacity, performance, color);
        this.wingType = wingType;
        this.landingType = landingType;
        this.tuition = tuition;
    }

    

    
    public String getWingType() {
        return wingType;
    }

    public String getLandingType() {
        return landingType;
    }

    public String getTuition() {
        return tuition;
    }

    public void setWingType(String wingType) {
        this.wingType = wingType;
    }

    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return "Air{" + "wingType=" + wingType + ", landingType=" + landingType + ", tuition=" + tuition + ", performance= "+ super.performance + ", peopleCapacity= "+ super.peopleCapacity + ", speed= " + super.speed + ", company= "+ super.company + ", fuel= "+ super.fuel + '}';
    }
    
}
