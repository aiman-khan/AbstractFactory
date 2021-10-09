package example3BirdsAnimals;

public class FactoryCreator {
	   public static AbstractFactory getFactory(String factoryType){
	 
	    /* It is a factory of factories */
	      if(factoryType.equalsIgnoreCase("BIRD")){
	         return new BirdFactory();         
	      } else if (factoryType.equalsIgnoreCase("ANIMAL")){
	         return new AnimalFactory();
	      } else {
	       return null;
	      }
	       
	   }
	}
