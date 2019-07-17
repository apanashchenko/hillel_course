package trash.Pet;

public class PetMain {
    public static void main(String[] args) {
        Human human = new Human("Petya", 4);

       /* Cat cat = new Cat("Vasya",  Gender.FEMALE, human);
        Dog dog = new Dog("Kusok",  Gender.MALE, human);*/

       // System.out.println(cat.getAge());
        //System.out.println(dog.getAge());

        Cat catNew = new Cat();
        catNew.setName("Pirojok");
        catNew.setHumanAge(human.getAge());

    //    System.out.println(catNew.getAge());

        Dog dogNew = new Dog();
        dogNew.setName("Pirog");
        dogNew.setHumanAge(human.getAge());

    //    System.out.println(dogNew.getAge());

        BritishCat britishCat = new BritishCat();
        System.out.println(britishCat.getAge());
        britishCat.drink();
    }
}