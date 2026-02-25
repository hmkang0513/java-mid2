package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);

        WildCardEx.printGenericV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        System.out.println("dog = " + dog);

        WildCardEx.printWildcardV1(dogBox);

        WildCardEx.printWildcardV2(dogBox);

        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
        System.out.println("animal = " + animal);

        catBox.set(new Cat("야옹이",50));
        Cat cat = WildCardEx.printAndReturnGeneric(catBox);
        System.out.println("cat = " + cat);

        Dog dog2 = (Dog) WildCardEx.printAndReturnWildcard(dogBox);
    }
}
