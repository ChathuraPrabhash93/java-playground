package inheritance.scenarios;

public class Scenario {

    public void doing(Animal animal){
        animal.doing();
    }
    public void doing(Dog dog){
        dog.doing();
    }
    public void doing(Cat cat){
        cat.doing();
    }

    public static void main(String[] args) {
        Scenario scenario = new Scenario();

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        scenario.doing(animal);
        scenario.doing(dog);
        scenario.doing(cat);
    }
}
