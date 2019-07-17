package trash.Interface;

public class Car implements IAction, IEnergy{
    private String mark;

    public Car(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public  void showInfo(){
        System.out.println("Best car is " + this.mark);
    }

    @Override
    public void move() {
        System.out.println(this.mark + " is moving by road Polya");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(this.mark + " make noise BIP-BIP");

    }

    @Override
    public void lowEnegry() {
        System.out.println(this.mark + " tank is empty");
    }
}
