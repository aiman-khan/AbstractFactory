package example2Vehicles;

public class Yamaha extends Motorcycle{

    Yamaha() {
        setId(++count);
        brandMotorcycle = BrandMotorcycle.YAMAHA;
        System.out.println("Yamaha Motorcycle");

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
