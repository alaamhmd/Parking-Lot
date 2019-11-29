
package parkinglot;

import parkinglot.Car;
import parkinglot.ParkingLot;
import parkinglot.ParkingSpot;
import parkinglot.Ticket;
import parkinglot.Vehicle;
import parkinglot.VehicleSize;
public class test{ 
    


   public static void main(String[] args) {
        Car c1 = new Car("1111", "Compact"); 
        Car c2 = new Car("2222", "Regular"); 
         
        ParkingLot lot1 = new ParkingLot(2, 3);
        lot1.parkVehicle(c1);
        lot1.parkVehicle(c2);
        Ticket t1 = new Ticket(c1);
        System.out.print(lot1.parkVehicle(c2));
        System.out.print(lot1.TypeOftoVehicle);
        System.out.print(c1.spotsNeeded);
        System.out.print(t1.getVehicle());


       
        
     

    }
}


