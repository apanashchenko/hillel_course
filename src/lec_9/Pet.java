package lec_9;

public class Pet {
    private String name;
    private int age;
    private Enum gender;
    private Human owner;

    public Pet(){}

    public Pet(String name, Enum gender, Human owner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.owner = owner;
    }

    public void run(String name){
        System.out.println(name + " runs");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Enum getGender() {
        return gender;
    }

    public Human getOwner(){
        return owner;
    }
}
