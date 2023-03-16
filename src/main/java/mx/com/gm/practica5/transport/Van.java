/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.practica5.transport;

/**
 *
 * @author Alumno
 */
public class Van extends Land{
    private TypeServiceEnum typeService;
    private double cost;
    private String name; 

    public Van(TypeServiceEnum typeService, double cost, String name, int whelles, String landType, String fuel, String company, int speed, int peopleCapacity, double performance, String color) {
        super(whelles, landType, fuel, company, speed, peopleCapacity, performance, color);
        this.typeService = typeService;
        this.cost = cost;
        this.name = name;
    }

    public TypeServiceEnum getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeServiceEnum typeService) {
        this.typeService = typeService;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Van{" + "typeService=" + typeService + ", cost=" + cost + ", name=" + name + " "+ super.toString()+'}';
    }
    
    
}
