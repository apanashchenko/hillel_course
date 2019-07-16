package trash.Interface;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob");
        Car car = new Car("Subaru");

        person.sayHello();
        person.move();
        person.makeSomeNoise();
        person.lowEnegry();

        action(person);

        System.out.println();

        car.showInfo();
        car.move();
        car.makeSomeNoise();
        car.lowEnegry();

        action(car);


        IAction iActions = new IAction() {
            @Override
            public void move() {
                System.out.println("run run eun");
            }

            @Override
            public void makeSomeNoise() {
                System.out.println("SREEEEEMM");
            }
        };

        System.out.println("==============");
        action(iActions);


    }

    public static void action(IAction actions){
        actions.move();
        actions.makeSomeNoise();
    }

    public static void energy(IEnergy energy){
        energy.lowEnegry();
    }
}
