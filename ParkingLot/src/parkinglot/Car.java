/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

public class Car extends Vehicle{
    public Car(String ID, String type){
        spotsNeeded = 1;
        size = VehicleSize.CarSize;
        this.ID = ID;
        this.type = type;
    }

    Car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.CarSize;
    }
}

