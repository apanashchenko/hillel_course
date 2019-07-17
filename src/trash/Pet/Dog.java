package trash.Pet;

public class Dog extends Pet {
   // int age;
/*
    public Dog(){}
    public Dog (String name,  Enum gender, Human owner) {
        super(name, gender, owner);*/
      //  this.age = calculateDogAge(owner);
   // }

   /* public int calculateDogAge(Human owner) {
        if (owner.getAge() == 1) {
            this.age = 15;
        } else if (owner.getAge() == 2) {
            this.age = 24;
        } else {
            this.age = 24 + (owner.getAge() - 2) * 5;
        }
        return this.age;
    }*/

    @Override
    protected int calculateAge(int humanAge) {
        int dogAge=0;
        if (humanAge == 1) {
            dogAge = 15;
        } else if (humanAge == 2) {
            dogAge = 24;
        } else {
            dogAge = 24 + (humanAge - 2) * 5;
        }
        return dogAge;
    }


   /* public void bark(String name){
        System.out.println(name + "can bark");
    }*/
}
