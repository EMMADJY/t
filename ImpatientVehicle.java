package finals;

public class ImpatientVehicle extends Vehicle {
    static int Q_TOO_LONG_LENGTH = 5;

    @Override
    public boolean joinVehicleQ() {
        if (Road.vehicleQ.size() >= Q_TOO_LONG_LENGTH) {
            System.out.println("***" + TrafficLight.lightString() + ": "+ this + " exiting. " + Road.qLengthString());
            return false;
        }
        return super.joinVehicleQ();
    }

    @Override
    public String toString() {
        return String.format("ImpatientVehicle %d", id);
    }
}
