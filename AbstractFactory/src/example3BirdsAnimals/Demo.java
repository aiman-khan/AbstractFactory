package example3BirdsAnimals;

public class Demo {
    public static void main(String[] args) {
 
        //get factory of Animals using FactoryCreator 
        AbstractFactory animalFactory = FactoryCreator.getFactory("ANIMAL");
 
        // create animal objects using AbstractFactory interface
        Animal lion = animalFactory.getAnimal("LION");
        Animal horse = animalFactory.getAnimal("HORSE");
 
     //get factory of Birds using FactoryCreator 
        AbstractFactory birdFactory = FactoryCreator.getFactory("BIRD");
 
        // create bird objects using AbstractFactory interface
        Bird sparrow = birdFactory.getBird("SPARROW");
        Bird eagle = birdFactory.getBird("EAGLE");
        
        // Call run method of Animal interface 
        lion.run();
        horse.run();
        
        // Call fly method of Bird interface 
        sparrow.fly();
        eagle.fly();
    }
}
