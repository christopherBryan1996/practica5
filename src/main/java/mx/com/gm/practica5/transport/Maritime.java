package mx.com.gm.practica5.transport;

public class Maritime extends Transport{
    private boolean immerse;
    private String motorType;
    private boolean bridge;

    public Maritime(boolean immerse, String motorType, boolean bridge, String fuel, String company, int speed, int peopleCapacity, double performance, String color) {
        super(fuel, company, speed, peopleCapacity, performance, color);
        this.immerse = immerse;
        this.motorType = motorType;
        this.bridge = bridge;
    }

    
    
    public boolean isImmerse() {
        return immerse;
    }

    public String getMotorType() {
        return motorType;
    }

    public boolean isBridge() {
        return bridge;
    }

    public void setImmerse(boolean immerse) {
        this.immerse = immerse;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public void setBridge(boolean bridge) {
        this.bridge = bridge;
    }

    @Override
    public String toString() {
        return "Maritime{" + "immerse=" + immerse + ", motorType=" + motorType + ", bridge=" + bridge +", color="+ super.color + ", performance= "+ super.performance + ", peopleCapacity= "+ super.peopleCapacity + ", speed= " + super.speed + ", company= "+ super.company + ", fuel= "+ super.fuel + '}';
    }

    
    
}
