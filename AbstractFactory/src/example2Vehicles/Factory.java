package example2Vehicles;

public abstract class Factory {
    public abstract Car createCar(BrandCars brandCars);
    public abstract Motorcycle createMotorcycle(BrandMotorcycle brandMotorcycle);
}
