package example3BirdsAnimals;

public abstract class AbstractFactory {
    abstract Bird getBird(String birdType);
    abstract Animal getAnimal(String animalType) ;
}