package 泛型;

import java.util.ArrayList;
import java.util.List;

public class jv {
    public static void main(String[] args) {
//        List<? extends Animal> animals = new ArrayList<>();
//        List<Dog> dogs  = new ArrayList<>();
//        animals = dogs;
        List<Animal> animals = new ArrayList<>();
        List<? super Dog> dogs  = new ArrayList<>();
        dogs = animals;

    }
}

class Animal{

}
class Dog extends Animal{

}
