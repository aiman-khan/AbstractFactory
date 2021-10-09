package example2Vehicles;

public class Ducati extends Motorcycle{

    Ducati() {
        setId(++count);
        brandMotorcycle = BrandMotorcycle.DUCATI;
        System.out.println("Ducati MotorCycle");

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
