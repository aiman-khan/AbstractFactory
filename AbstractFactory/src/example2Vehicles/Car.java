package example2Vehicles;

public abstract class Car {
    int id;
    static int count = 0;
    BrandCars brandCars;

    abstract int getId();
    abstract void setId(int id);
}
