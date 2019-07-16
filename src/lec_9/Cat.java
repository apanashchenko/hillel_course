package lec_9;

public class Cat extends Pet {
    private int age;
    public Cat(String name, Enum gender, Human owner) {
        super(name, gender, owner);
        this.age = calculateCatAge(owner);
    }

    public int calculateCatAge(Human owner) {
        if (owner.getAge() == 1) {
            this.age = 15;
        } else if (owner.getAge() == 2) {
            this.age = 24;
        } else {
            this.age = 24 + (owner.getAge() - 2) * 4;
        }
        return this.age;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void meow(String name) {
        System.out.println(name + "can meow");
    }
}