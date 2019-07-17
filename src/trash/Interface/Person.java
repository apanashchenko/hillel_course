package trash.Interface;

public class Person implements IAction, IEnergy{
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  public void sayHello()
  {
      System.out.println("Hello, my name is " + this.name);
  }

    @Override
    public void move() {
        System.out.println(this.name + " is moving");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(this.name + "make some noise");
    }


    @Override
    public void lowEnegry() {
        System.out.println(this.name + "low energy");
    }
}
