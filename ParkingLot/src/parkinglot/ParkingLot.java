
package parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class ParkingLot{
     public static void main(String[] args) {
    }
    private int numberOfSpots;

    Map<String, ArrayList<String>> TypeOftoVehicle;
    public ParkingLot( int numberSpots){
        this.numberOfSpots = numberOfSpots;
        this.TypeOftoVehicle = new HashMap<String, ArrayList<String>>();
       

    }

    ParkingLot(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public boolean parkVehicle(Vehicle vehicle){

        
                if (this.TypeOftoVehicle.containsKey(vehicle.type)) {
                    ArrayList<String> regNoList = this.TypeOftoVehicle.get(vehicle.type);
                    this.TypeOftoVehicle.remove(vehicle.type);
                    regNoList.add(vehicle.ID);
                    this.TypeOftoVehicle.put(vehicle.type, regNoList);
                } else {
                    ArrayList<String> regNoList = new ArrayList<String>();
                    regNoList.add(vehicle.ID);
                    this.TypeOftoVehicle.put(vehicle.type, regNoList);
                }
                return true;
            
        
    
    }

    public boolean leave(Vehicle vehicle ){
        ArrayList<String> VehicleList = this.TypeOftoVehicle.get(vehicle.type);
        if (VehicleList.contains(vehicle.ID)) {
            VehicleList.remove(vehicle.ID);
        }
        return true;
    }
    public void TypeOfVehicleParked(String type){
        ArrayList<String> VehicleList = this.TypeOftoVehicle.get(type);
        System.out.print("The vehicles of " +type + " ");
      
    }
}
 
