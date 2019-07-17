package trash.Pet;

public abstract class Pet {
    private String name;
    private int age;
    private Enum gender;
    private Human owner;
    private int humanAge;

  //  public Pet(){}
/*
    public Pet(String name, Enum gender, Human owner) {
        this.name = name;
        this.gender = gender;
        this.owner = owner;
    }*/

    protected abstract int calculateAge(int humanAge);

   /* public void run(String name){
        System.out.println(name + " runs");
    }*/



    public int getAge() {
        return calculateAge(humanAge);
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

   /* public void setGender(Enum gender) {
        this.gender = gender;
    }*/

    /*public void setOwner(Human owner) {
        this.owner = owner;
    }*/

    /*public Enum getGender() {
        return gender;
    }

    public Human getOwner(){
        return owner;
    }*/

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", owner=" + owner +
                ", humanAge=" + humanAge +
                '}';
    }

    public final void action(){
        System.out.println("I want some food");
    }
}
