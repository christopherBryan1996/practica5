package mx.com.gm.practica5.transport;

public class Transport {
    protected  String fuel;
    protected  String company;
    protected  int speed;
    protected  int peopleCapacity;
    protected  double performance;
    protected String color;
    
    public Transport(String fuel, String company, int speed, int peopleCapacity, double performance, String color) {
        this.fuel = fuel;
        this.company = company;
        this.speed = speed;
        this.peopleCapacity = peopleCapacity;
        this.performance = performance;
        this.color = color;
    }
    
    public String getFuel() {
        return fuel;
    }

    public String getCompany() {
        return company;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public double getPerformance() {
        return performance;
    }

    public String getColor() {
        return color;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}
