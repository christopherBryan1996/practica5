package mx.com.gm.practica5;

import java.util.*;
import mx.com.gm.practica5.transport.*;

public class Practica5 {

    public static void main(String[] args) {
        
        //Ejemplo de tres niveles 
        int count= 0;
        List<Car> cars = new ArrayList<>();
        List<Van> vans = new ArrayList<>();
        List<Bicycle> bicycles = new ArrayList<>();
        
        //Ejemplo de dos niveles 
        List<Air> airplanes = new ArrayList<>();
        List<Air> helicopters = new ArrayList<>();
        
        List<Maritime> barcos = new ArrayList<>();
        List<Maritime> trajineras = new ArrayList<>();
        List<Maritime> submarinos = new ArrayList<>();
        
        cars.add(new Car(TypeServiceEnum.PUBLIC,5.50,"taxi",4, "Asfalto", "gasolina", "Ford", 250, 5, 750, "Azul"));
        cars.add(new Car(TypeServiceEnum.PRIVATE,8.50,"UBER",4, "Asfalto", "gasolina", "honda", 350, 5, 850, "Negro"));
        
        vans.add(new Van(TypeServiceEnum.PRIVATE,8.50,"UBER",4, "Todo terreno", "Disel", "Chevrolet", 300, 9, 1500, "Negra"));
        vans.add(new Van(TypeServiceEnum.PUBLIC,20.50,"Taxi aeropuerto",4, "Todo terreno", "Disel", "Chevrolet", 300, 9, 1500, "Negra"));

        bicycles.add(new Bicycle(TypeServiceEnum.PRIVATE,10.50,"Chapu",2, "Tierra", "Mecanica", "Benoto", 10, 1, 1, "Blanca"));
        bicycles.add(new Bicycle(TypeServiceEnum.PRIVATE,10.50,"Chapu duo",2, "Tierra", "Mecanica", "Benoto", 10, 2, 1, "Blanca"));
        bicycles.add(new Bicycle(TypeServiceEnum.PRIVATE,10.50,"Chapu duple",2, "Tierra", "Mecanica", "Benoto", 10, 4, 1, "Blanca"));
        bicycles.add(new Bicycle(TypeServiceEnum.PUBLIC,1.50,"Ecobici",2, "Tierra", "Mecanica", "CDMX", 10, 1, 1, "Negras"));


        airplanes.add(new Air("Delta", "aterrizaje" , "5104","turbocina", "Mexicana", 300, 100, 1000, "blanco"));
        airplanes.add(new Air("alfa", "amerisaje", "12345","gasolina", "Aeromexico", 700, 200, 5000, "azul"));
        airplanes.add(new Air("beta", "aterrizaje", "y510","electrico", "Aeromar", 500, 150, 2000, "amarillo"));
        
        helicopters.add(new Air("rotativa", "aterrizaje", "5236","electrico", "Artek", 100, 6, 1000, "negro"));
        helicopters.add(new Air("rotativa", "amerisaje", "569p","gasolina", "Sedena", 200, 4, 2000, "negro"));
        helicopters.add(new Air("rotativa", "amerisaje", "u789","gasolina", "OCEANKING", 200, 10, 2000, "blanco"));
        
        
        barcos.add(new Maritime(false, "Helices", true, "Disel", "Ocean", 400, 5000, 5000, "Blanco"));
        trajineras.add(new Maritime(false, "Palito", false, "Humano", "Xochimilco", 10, 25, 5000, "Multicolor"));
        submarinos.add(new Maritime(true, "Nuclear", false, "Nuclear", "U-BOT", 500, 200, 5000, "Negro"));
       
        System.out.println("\nDetalles de trasportes terrestres");
       
       System.out.println("Carros"); 
        for (Land car : cars ) {
            count++;
            System.out.println(count+" "+car.toString());
        }
        
        System.out.println("\nCamionetas"); 
        count=0;
        for (Van van : vans ) {
            count++;
            System.out.println(count+" "+van.toString());
        }
        
        System.out.println("\nBicicleta"); 
        count=0;
        for (Bicycle bicycle : bicycles ) {
            count++;
            System.out.println(count+" "+bicycle.toString());
        }
        
        System.out.println("\nDetalles de trasportes aerios"); 
        
        System.out.println("Aeroplanos"); 
        count=0;
        for (Air air : airplanes ) {
            count++;
            System.out.println(count+" "+air.toString());
        }
        
        System.out.println("Helicopteros"); 
        count=0;
        for (Air air : helicopters) {
            count++;
            System.out.println(count+" "+air.toString());
        }
        
        System.out.println("\nDetalles de trasportes Maritimos"); 
        
        System.out.println("Barco"); 
        count=0;
        for (Maritime maritime : barcos ) {
            count++;
            System.out.println(count+" "+maritime.toString());
        }
        
        System.out.println("Trajineras"); 
        count=0;
        for (Maritime maritime : trajineras ) {
            count++;
            System.out.println(count+" "+maritime.toString());
        }
        
        System.out.println("Submarinos"); 
        count=0;
        for (Maritime maritime : submarinos ) {
            count++;
            System.out.println(count+" "+maritime.toString());
        }
        
    }

    
}
