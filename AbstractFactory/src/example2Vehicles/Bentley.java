package example2Vehicles;

public class Bentley extends Car {

    Bentley() {
        setId(++count);
        brandCars = BrandCars.BENTLEY;
        System.out.println("Bentley Car");

    }
    @Override
    int getId() {
        return id;
    }

    @Override
    void setId(int id) {
        this.id = id;
    }
}
