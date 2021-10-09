package example2Vehicles;

public class Chevrolet extends Car {

    Chevrolet() {
        setId(++count);
        brandCars = BrandCars.CHEVROLET;
        System.out.println("Chevrolet Car");
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
