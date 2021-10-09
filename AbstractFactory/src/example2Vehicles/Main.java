package example2Vehicles;

public class Main {
    public static void main(String[] args) {
        //I want create cars and motorcycles
        Factory factoryCar = new FactoryCars();
        Car car1 = factoryCar.createCar(BrandCars.BENTLEY);
        Car car2 = factoryCar.createCar(BrandCars.CHEVROLET);

        Factory factoryMotorcycle = new FactoryMotorcycles();
        Motorcycle moto1 = factoryMotorcycle.createMotorcycle(BrandMotorcycle.DUCATI);
        Motorcycle moto2 = factoryMotorcycle.createMotorcycle(BrandMotorcycle.YAMAHA);
        
        
    }
}
