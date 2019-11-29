
package parkinglot;

public class Ticket {

    private final long startTime = System.currentTimeMillis();
    private final Vehicle vehicle;

    public Ticket(Vehicle vehicle) {
        super();
        this.vehicle = vehicle;
    }
    public long calcualteParkingDuration(){
        return System.currentTimeMillis() - startTime;
    }
    

    public Vehicle getVehicle(){
        return vehicle;
    }
}
    