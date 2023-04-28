package Vehicle_data;

public enum VehicleType {
    PLANE(1),
    HELICOPTER(10),
    SUBMARINE(100);
    private final int power;

    VehicleType(int power) {
        this.power = power;
    }
    public static int getPower(VehicleType vehicleType) {
        return vehicleType.power;
    }
}
