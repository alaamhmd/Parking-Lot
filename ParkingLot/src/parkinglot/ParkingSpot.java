
package parkinglot;
public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int line;
    private int spotNumber;

    public ParkingSpot(int l, int n, VehicleSize s) {
         line = l;
        spotNumber = n;
        spotSize = s;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        //check if the spot is big enough and is available
        return isAvailable() && vehicle.canFitInSpot(this);
    }

    public boolean park(Vehicle v) {
        if (!canFitVehicle(v))
            return false;

        vehicle = v;
        vehicle.parkInSpot(this);
        return true;
    }

    public int getLine() {
        return line;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleSize getSize() {
        return spotSize;
    }

    public void removeVehicle() {
        vehicle = null;
    }
}



