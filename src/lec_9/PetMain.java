package lec_9;

public class PetMain {
    public static void main(String[] args) {
        Human human = new Human("Petya", 4);

        Cat cat = new Cat("Vasya",  Gender.FEMALE, human);
        Dog dog = new Dog("Kusok",  Gender.MALE, human);

        System.out.println(cat.getAge());
        System.out.println(dog.getAge());
    }
}