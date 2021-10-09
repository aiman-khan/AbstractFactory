package example3BirdsAnimals;

public class AnimalFactory extends AbstractFactory {
	  
    @Override
    public Animal getAnimal(String animalType){
        if(animalType == null){
            return null;
        }  
        
        if(animalType.equalsIgnoreCase("LION")){
            return new Lion();
        } else if (animalType.equalsIgnoreCase("HORSE")){
            return new Horse();
        } else {
            return null;
        }
    }
     
    @Override
    Bird getBird(String birdType) {
        return null;
    }
}