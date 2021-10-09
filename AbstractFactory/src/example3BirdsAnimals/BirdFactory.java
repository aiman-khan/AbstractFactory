package example3BirdsAnimals;

public class BirdFactory extends AbstractFactory {
	  
    @Override
    public Bird getBird(String birdType){
     if(birdType == null){
         return null;
     }  
        
        if(birdType.equalsIgnoreCase("EAGLE")){
          return new Eagle();
     } else if (birdType.equalsIgnoreCase("SPARROW")){
          return new Sparrow();
     } else {
          return null;
     }
    }
     
    @Override
    Animal getAnimal(String animalType) {
        return null;
 }
}