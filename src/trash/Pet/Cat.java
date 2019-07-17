package trash.Pet;

public class Cat extends Pet {
  /*  private int age;
    private int humanAge;
    public Cat(){}*/
    /*public Cat(String name, Enum gender, Human owner) {
        super(name, gender, owner);*/
      //  this.age = calculateCatAge(owner);
   // }



    @Override
    protected int calculateAge(int humanAge) {
        int catAge = 0;
        if (humanAge == 1) {
            catAge= 15;
        } else if (humanAge == 2) {
            catAge = 24;
        } else {
            catAge = 24 + (humanAge - 2) * 4;
        }
        return catAge;
    }

    /*public int calculateCatAge(Human owner) {
        if (owner.getAge() == 1) {
            this.age = 15;
        } else if (owner.getAge() == 2) {
            this.age = 24;
        } else {
            this.age = 24 + (owner.getAge() - 2) * 4;
        }
        return this.age;
    }*/


/*
    public void meow(String name) {
        System.out.println(name + "can meow");
    }*/
}